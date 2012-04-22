package com.springinpractice.ch03.view;

import java.util.List;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.OrderComparator;
import org.springframework.core.Ordered;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.mobile.device.site.SitePreferenceUtils;
import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationObjectSupport;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SitePreferenceDelegatingViewResolver extends WebApplicationObjectSupport implements ViewResolver, Ordered, InitializingBean {

	private static final Log logger = LogFactory.getLog(SitePreferenceDelegatingViewResolver.class);
	
	private int order = Ordered.HIGHEST_PRECEDENCE;
	
	private List<ViewResolver> normalViewResolvers;
	private List<ViewResolver> mobileViewResolvers;
	
	public void setOrder(int order) {
		this.order = order;
	}

	public int getOrder() {
		return this.order;
	}
		
	public void setNormalViewResolvers(List<ViewResolver> normalViewResolvers) {
		this.normalViewResolvers = normalViewResolvers;
	}

	public void setMobileViewResolvers(List<ViewResolver> mobileViewResolvers) {
		this.mobileViewResolvers = mobileViewResolvers;
	}
	
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();		
		
		SitePreference sitePreference = SitePreferenceUtils.getCurrentSitePreference(request);				
		Device device = DeviceUtils.getRequiredCurrentDevice(request);
		
		List<ViewResolver> viewResolvers = null;				
		if (SitePreference.MOBILE == sitePreference || device.isMobile() && sitePreference == null) {			
			logger.debug("resolving viewName '" + viewName + "' using mobileViewResolvers.");						
			viewResolvers = this.mobileViewResolvers;			
		}
		else {
			logger.debug("resolving viewName '" + viewName + "' using normalViewResolvers.");
			viewResolvers = this.normalViewResolvers;			
		}
		
		return resolveViewNameInternal(viewResolvers, viewName, locale);
	}
	
	
	/**
	 * Resolve the given view name into a View object.  The default implementation
	 * asks all provided ViewResolvers until a 
	 * @param viewResolvers
	 * @param viewName
	 * @param locale
	 * @return
	 * @throws Exception
	 */
	protected View resolveViewNameInternal(List<ViewResolver> viewResolvers, String viewName, Locale locale) throws Exception {

		for (ViewResolver viewResolver : viewResolvers) {
			View view = viewResolver.resolveViewName(viewName, locale);
			if (view != null) {
				return view;
			}
		}
		return null;
	}

	public void afterPropertiesSet() throws Exception {
		/**
		 * Validate that we have at least one viewResolver specified for normal and mobile
		 */		
		Assert.notNull(this.normalViewResolvers, "'normalViewResolvers' must not be null");
		Assert.notEmpty(this.normalViewResolvers, "'normalViewResolvers' must not be empty");
		// Keep the normal ViewResolvers in sorted order.
		OrderComparator.sort(this.normalViewResolvers);
		
		Assert.notNull(mobileViewResolvers, "'mobileViewResolvers' must not be null");
		Assert.notEmpty(mobileViewResolvers, "'mobileViewResolvers' must not be empty");
		// Keep the mobile ViewResolvers in sorted order.
		OrderComparator.sort(this.normalViewResolvers);				
	}	

}
