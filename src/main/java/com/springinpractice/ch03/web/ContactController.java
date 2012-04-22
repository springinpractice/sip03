package com.springinpractice.ch03.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springinpractice.ch03.model.Contact;


@Controller
@RequestMapping("/contact")
public final class ContactController {
	private List<Contact> contacts = new ArrayList<Contact>();
	
	public ContactController() {
		
		//Names generated using http://www.fakenamegenerator.com
		contacts.add(new Contact("David", "Smith", "DavidDSmith@mailinator.com", "(714) 282-1728"));
		contacts.add(new Contact("Michelle", "Landry", "MichelleRLandry@spambob.com", "(715) 979-4767"));
		contacts.add(new Contact("Margaret", "Lockwood", "MargaretGLockwood@trashymail.com", "(940) 264-8228"));
		contacts.add(new Contact("Jayne", "Bradburn", "JayneSBradburn@spambob.com", "(201) 845-6632"));
		contacts.add(new Contact("Dawn", "Brown", "DawnLBrown@dodgit.com", "(216) 251-6023"));
		contacts.add(new Contact("Carolyn", "Price", "CarolynRPrice@mailinator.com", "(330) 536-5628"));
		contacts.add(new Contact("Amos", "McCulloch", "AmosCMcCulloch@mailinator.com", "(510) 849-3746"));
		contacts.add(new Contact("Daniel", "Bridges", "DanielMBridges@spambob.com", "(541) 409-5172"));
		contacts.add(new Contact("Ivan", "Kramer", "IvanKKramer@pookmail.com", "(608) 407-6482"));
		contacts.add(new Contact("Ernesto", "Jones", "ErnestoTJones@pookmail.com", "(504) 671-0696"));
		contacts.add(new Contact("Corinne", "Dickerson", "CorinneJDickerson@trashymail.com", "(404) 828-1535"));
		contacts.add(new Contact("Michael", "Douglas", "MichaelKDouglas@dodgit.com", "(662) 995-3208"));
		contacts.add(new Contact("Lindsey", "Robledo", "LindseyDRobledo@spambob.com", "(937) 568-6124"));
		contacts.add(new Contact("Myrna", "Rubio", "MyrnaBRubio@mailinator.com", "(919) 843-8750"));
		contacts.add(new Contact("Todd", "Hembree", "ToddSHembree@trashymail.com", "(903) 549-8562"));
		contacts.add(new Contact("Pamela", "Tassone", "PamelaJTassone@mailinator.com", "(781) 407-5803"));
		contacts.add(new Contact("Stanley", "Kellogg", "StanleyBKellogg@pookmail.com", "(203) 284-2722"));
		contacts.add(new Contact("Darrell", "Lombardi", "DarrellALombardi@trashymail.com", "(845) 362-0687"));
		contacts.add(new Contact("Michael", "Evans", "MichaelMEvans@mailinator.com", "(323) 648-6317"));
		contacts.add(new Contact("Jean", "Sexton", "JeanTSexton@mailinator.com", "(330) 241-0624"));
		contacts.add(new Contact("Tracy", "Hawkins", "TracyMHawkins@spambob.com", "(732) 677-6839"));
		contacts.add(new Contact("Chung", "Martin", "ChungTMartin@spambob.com", "(609) 704-6183"));
		contacts.add(new Contact("Thomas", "Crook", "ThomasECrook@pookmail.com", "(567) 202-6280"));
		contacts.add(new Contact("Carin", "Caufield", "CarinWCaufield@dodgit.com", "(724) 420-2387"));
		contacts.add(new Contact("Michael", "Bartow", "MichaelCBartow@mailinator.com", "(240) 394-5769"));
		contacts.add(new Contact("Rebbeca", "Wilson", "RebbecaJWilson@dodgit.com", "(830) 213-6590"));
		contacts.add(new Contact("Susan", "Harker", "SusanJHarker@dodgit.com", "(512) 943-1303"));
		contacts.add(new Contact("Kathleen", "Butler", "KathleenJButler@trashymail.com", "(909) 657-8228"));
		contacts.add(new Contact("Rachel", "Campos", "RachelBCampos@spambob.com", "(706) 877-8148"));
		contacts.add(new Contact("Charles", "Starkweather", "CharlesLStarkweather@spambob.com", "(512) 968-1526"));
		contacts.add(new Contact("Brandon", "Wharton", "BrandonLWharton@dodgit.com", "(760) 856-3631"));
		contacts.add(new Contact("Shirley", "Reed", "ShirleyFReed@dodgit.com", "(423) 933-9643"));
		contacts.add(new Contact("Kristy", "Jensen", "KristyAJensen@mailinator.com", "(251) 634-9709"));
		contacts.add(new Contact("Patrick", "Mowry", "PatrickKMowry@dodgit.com", "(304) 774-3690"));
		contacts.add(new Contact("Deborah", "Yeager", "DeborahDYeager@trashymail.com", "(818) 865-1036"));
		contacts.add(new Contact("Lisa", "Craig", "LisaACraig@trashymail.com", "(434) 849-0506"));
		contacts.add(new Contact("Yong", "Blythe", "YongDBlythe@dodgit.com", "(734) 576-3730"));
		contacts.add(new Contact("Marvin", "Aylward", "MarvinEAylward@trashymail.com", "(254) 333-4408"));
		contacts.add(new Contact("Christine", "Moon", "ChristineEMoon@pookmail.com", "(909) 560-3902"));
		contacts.add(new Contact("David", "Garrett", "DavidHGarrett@dodgit.com", "(414) 455-9212"));
		contacts.add(new Contact("Joann", "Jackson", "JoannGJackson@spambob.com", "(916) 778-8055"));
		contacts.add(new Contact("Kim", "Boozer", "KimVBoozer@spambob.com", "(309) 563-6828"));
		contacts.add(new Contact("Cheryl", "Albro", "CherylIAlbro@spambob.com", "(715) 892-2621"));
		contacts.add(new Contact("Vada", "Ramos", "VadaSRamos@pookmail.com", "(954) 259-3472"));
		contacts.add(new Contact("Jimmy", "Jean", "JimmyHJean@mailinator.com", "(631) 442-8426"));
		contacts.add(new Contact("Raymond", "Geise", "RaymondAGeise@dodgit.com", "(631) 540-7423"));
		contacts.add(new Contact("Vernice", "Myers", "VerniceMMyers@mailinator.com", "(701) 879-0959"));
		contacts.add(new Contact("Cecilia", "Myers", "CeciliaSMyers@trashymail.com", "(704) 679-4079"));
		contacts.add(new Contact("Tracy", "Thibodeau", "TracyLThibodeau@dodgit.com", "(661) 423-0940"));
		contacts.add(new Contact("Mae", "Nicholson", "MaeTNicholson@trashymail.com", "(302) 865-5001"));
		contacts.add(new Contact("Gregory", "Nguyen", "GregoryJNguyen@trashymail.com", "(207) 831-8540"));
		contacts.add(new Contact("Mark", "Moore", "MarkCMoore@spambob.com", "(818) 774-0008"));
		contacts.add(new Contact("Deborah", "Gleason", "DeborahPGleason@dodgit.com", "(651) 318-6958"));
		contacts.add(new Contact("Susan", "Dedrick", "SusanJDedrick@mailinator.com", "(218) 391-1085"));
		contacts.add(new Contact("Sharon", "Staten", "SharonJStaten@pookmail.com", "(615) 824-2418"));
		contacts.add(new Contact("Kay", "Edwards", "KayTEdwards@mailinator.com", "(480) 515-8619"));
		contacts.add(new Contact("Khalilah", "Gros", "KhalilahJGros@mailinator.com", "(816) 883-3618"));
		contacts.add(new Contact("Bradley", "Kendall", "BradleyKKendall@mailinator.com", "(909) 606-6960"));
		contacts.add(new Contact("Danny", "Wilson", "DannyCWilson@spambob.com", "(618) 247-5003"));
		contacts.add(new Contact("Vina", "Potter", "VinaMPotter@dodgit.com", "(678) 439-5178"));
		contacts.add(new Contact("Robert", "Owens", "RobertLOwens@mailinator.com", "(816) 516-2493"));
		contacts.add(new Contact("Mia", "Palmer", "MiaNPalmer@spambob.com", "(312) 255-2466"));
		contacts.add(new Contact("Deborah", "Ullman", "DeborahKUllman@spambob.com", "(858) 357-3500"));
		contacts.add(new Contact("Ross", "Smith", "RossMSmith@trashymail.com", "(281) 712-3706"));
		contacts.add(new Contact("Gordon", "Redwine", "GordonSRedwine@pookmail.com", "(484) 247-3070"));
		contacts.add(new Contact("Della", "Schmaltz", "DellaTSchmaltz@dodgit.com", "(325) 625-4206"));
		contacts.add(new Contact("Brent", "Jorgensen", "BrentDJorgensen@mailinator.com", "(313) 620-3745"));
		contacts.add(new Contact("Manuela", "Toups", "ManuelaEToups@trashymail.com", "(650) 366-6806"));
		contacts.add(new Contact("Jorge", "Matthews", "JorgeMMatthews@mailinator.com", "(860) 461-1215"));
		contacts.add(new Contact("Dorothy", "Hildebrand", "DorothyTHildebrand@trashymail.com", "(814) 952-4956"));
		contacts.add(new Contact("Deborah", "Grimm", "DeborahDGrimm@dodgit.com", "(315) 755-4654"));
		contacts.add(new Contact("Martina", "Thompson", "MartinaJThompson@spambob.com", "(401) 678-0655"));
		contacts.add(new Contact("Jessica", "Tobias", "JessicaRTobias@pookmail.com", "(949) 614-9788"));
		contacts.add(new Contact("Michael", "Weber", "MichaelAWeber@dodgit.com", "(858) 509-8653"));
		contacts.add(new Contact("William", "Wilson", "WilliamPWilson@mailinator.com", "(940) 684-3060"));
		contacts.add(new Contact("Norman", "Eastman", "NormanJEastman@mailinator.com", "(425) 780-5305"));
		contacts.add(new Contact("Callie", "Schwab", "CallieVSchwab@spambob.com", "(213) 928-4066"));
		contacts.add(new Contact("Shawn", "McCartney", "ShawnSMcCartney@dodgit.com", "(714) 576-8105"));
		contacts.add(new Contact("Garry", "Stephenson", "GarryFStephenson@pookmail.com", "(651) 642-0328"));
		contacts.add(new Contact("John", "Hood", "JohnNHood@spambob.com", "(978) 247-9591"));
		contacts.add(new Contact("Gary", "Epps", "GaryKEpps@spambob.com", "(336) 799-8692"));
		contacts.add(new Contact("Gilbert", "Welch", "GilbertKWelch@mailinator.com", "(212) 960-2146"));
		contacts.add(new Contact("Rosalind", "Eckert", "RosalindHEckert@pookmail.com", "(239) 947-5711"));
		contacts.add(new Contact("Shirley", "Hawkins", "ShirleyGHawkins@spambob.com", "(503) 531-3648"));
		contacts.add(new Contact("David", "Harris", "DavidSHarris@spambob.com", "(760) 677-6751"));
		contacts.add(new Contact("Amelia", "Doty", "AmeliaJDoty@spambob.com", "(830) 789-6079"));
		contacts.add(new Contact("Toni", "Hall", "ToniJHall@trashymail.com", "(863) 443-8305"));
		contacts.add(new Contact("Leon", "Bowling", "LeonSBowling@spambob.com", "(936) 288-3453"));
		contacts.add(new Contact("Alex", "Shaw", "AlexMShaw@pookmail.com", "(830) 935-1968"));
		contacts.add(new Contact("Donna", "Gray", "DonnaTGray@mailinator.com", "(601) 723-7722"));
		contacts.add(new Contact("Mary", "Lampkin", "MaryRLampkin@trashymail.com", "(312) 262-0428"));
		contacts.add(new Contact("Linsey", "McCabe", "LinseyJMcCabe@pookmail.com", "(210) 547-9900"));
		contacts.add(new Contact("Ora", "Churchill", "OraLChurchill@trashymail.com", "(941) 988-3050"));
		contacts.add(new Contact("Antonia", "Souza", "AntoniaPSouza@mailinator.com", "(267) 310-1659"));
		contacts.add(new Contact("Edward", "Chang", "EdwardIChang@mailinator.com", "(402) 927-1324"));
		contacts.add(new Contact("Wendell", "Chambers", "WendellEChambers@spambob.com", "(301) 852-3753"));
		contacts.add(new Contact("Marlon", "Davis", "MarlonADavis@pookmail.com", "(847) 576-2588"));
		contacts.add(new Contact("Alma", "Raven", "AlmaERaven@dodgit.com", "(336) 710-7709"));
		contacts.add(new Contact("Patricia", "Reif", "PatriciaBReif@mailinator.com", "(309) 330-9923"));
		contacts.add(new Contact("Zachary", "Martin", "ZacharyGMartin@trashymail.com", "(770) 478-4541"));
		
		Collections.sort(contacts);		
	}
	
	@RequestMapping("/list")
	public void list(Model model) {
		model.addAttribute(contacts);
	}
	
	@RequestMapping("/detail")
	public void contact(@RequestParam("id") Integer id, Model model) {
		model.addAttribute(contacts.get(id));
	}
}