package com.ensaf.etudiant.mtapplication.util;

import android.util.EventLogTags;

import com.ensaf.etudiant.mtapplication.R;
import com.ensaf.etudiant.mtapplication.model.DummyModel;
import com.ensaf.etudiant.mtapplication.model.ImageGalleryCategoryModel;
import com.ensaf.etudiant.mtapplication.model.ImageGallerySubcategoryModel;

import java.util.ArrayList;
import java.util.Random;

public class DummyContent {
	
	public static ArrayList<DummyModel> getDummyModelList() {
		ArrayList<DummyModel> list = new ArrayList<>();

		list.add(new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/profileimages/0.jpg", "Isaac Reid", R.string.fontello_heart_empty));
		list.add(new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/profileimages/1.jpg", "Jason Graham", R.string.fontello_heart_empty));
		list.add(new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/profileimages/2.jpg", "Abigail Ross", R.string.fontello_heart_empty));
		list.add(new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/profileimages/3.jpg", "Justin Rutherford", R.string.fontello_heart_empty));
		list.add(new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/profileimages/4.jpg", "Nicholas Henderson", R.string.fontello_heart_empty));
		list.add(new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/profileimages/5.jpg", "Elizabeth Mackenzie", R.string.fontello_heart_empty));
		list.add(new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/profileimages/6.jpg", "Melanie Ferguson", R.string.fontello_heart_empty));
		list.add(new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/profileimages/7.jpg", "Fiona Kelly", R.string.fontello_heart_empty));
		list.add(new DummyModel(8, "http://pengaja.com/uiapptemplate/newphotos/profileimages/8.jpg", "Nicholas King", R.string.fontello_heart_empty));
		list.add(new DummyModel(9, "http://pengaja.com/uiapptemplate/newphotos/profileimages/9.jpg", "Victoria Mitchell", R.string.fontello_heart_empty));
		list.add(new DummyModel(10, "http://pengaja.com/uiapptemplate/newphotos/profileimages/10.jpg", "Sophie Lyman", R.string.fontello_heart_empty));
		list.add(new DummyModel(11, "http://pengaja.com/uiapptemplate/newphotos/profileimages/11.jpg", "Carl Ince", R.string.fontello_heart_empty));
		list.add(new DummyModel(12, "http://pengaja.com/uiapptemplate/newphotos/profileimages/12.jpg", "Michelle Slater", R.string.fontello_heart_empty));
		list.add(new DummyModel(13, "http://pengaja.com/uiapptemplate/newphotos/profileimages/13.jpg", "Ryan Mathis", R.string.fontello_heart_empty));
		list.add(new DummyModel(14, "http://pengaja.com/uiapptemplate/newphotos/profileimages/14.jpg", "Julia Grant", R.string.fontello_heart_empty));
		list.add(new DummyModel(15, "http://pengaja.com/uiapptemplate/newphotos/profileimages/15.jpg", "Hannah Martin", R.string.fontello_heart_empty));
		
		return list;
	}
	
	public static ArrayList<DummyModel> getDummyModelSwipeToDissmissTravelList() {
		ArrayList<DummyModel> list = new ArrayList<>();

		list.add(new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/0.jpg", "Monument walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/1.jpg", "River walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/2.jpg", "City walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/3.jpg", "Park walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/4.jpg", "Vilage walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/5.jpg", "Lake walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/6.jpg", "Castle walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/listviews/swipetodissmiss/travel/7.jpg", "Beach walk tour", R.string.fontello_heart_empty));
		
		return list;
	}
	
	public static ArrayList<DummyModel> getDummyModelSwipeToDissmissSocialList() {
		ArrayList<DummyModel> list = new ArrayList<>();

		list.add(new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/profileimages/3.jpg", "Monument walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/profileimages/4.jpg", "River walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/profileimages/5.jpg", "City walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/profileimages/6.jpg", "Park walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/profileimages/7.jpg", "Vilage walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/profileimages/8.jpg", "Lake walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/profileimages/9.jpg", "Castle walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/profileimages/10.jpg", "Beach walk tour", R.string.fontello_heart_empty));
		
		return list;
	}
	
	public static ArrayList<DummyModel> getDummyModelGoogleCardsTravelList() {
		ArrayList<DummyModel> list = new ArrayList<>();

		list.add(new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/0.jpg", "Bab Boujloud", R.string.fontello_heart_empty));
		list.add(new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/1.jpg", "Fontaine Nejjarine", R.string.fontello_heart_empty));
		list.add(new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/2.jpg", "Palais El Mokri", R.string.fontello_heart_empty));
		list.add(new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/3.jpg", "Borj Nord", R.string.fontello_heart_empty));
		list.add(new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/4.jpg", "Vilage walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/5.jpg", "Lake walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/6.jpg", "Castle walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/7.jpg", "Beach walk tour", R.string.fontello_heart_empty));

		return list;
	}
	
	public static ArrayList<DummyModel> getDummyModelDragAndDropTravelList() {
		ArrayList<DummyModel> list = new ArrayList<>();

		list.add(new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/0.jpg", "Bab Boujloud", R.string.fontello_heart_empty));
		list.add(new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/1.jpg", "Fontaine Nejjarine", R.string.fontello_heart_empty));
		list.add(new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/2.jpg", "Palais El Mokri", R.string.fontello_heart_empty));
		list.add(new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/3.jpg", "Borj Nord", R.string.fontello_heart_empty));
		list.add(new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/4.jpg", "Vilage walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/5.jpg", "Lake walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/6.jpg", "Castle walk tour", R.string.fontello_heart_empty));
		list.add(new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/listviews/draganddrop/travel/7.jpg", "Beach walk tour", R.string.fontello_heart_empty));
		
		return list;
	}
	
	public static ArrayList<DummyModel> getDummyModelListSocial() {
		ArrayList<DummyModel> list = new ArrayList<>();

		list.add(new DummyModel(0, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/0.jpg", "Jane Smith", R.string.fontello_heart_empty));
		list.add(new DummyModel(1, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/1.jpg", "Jane Smith", R.string.fontello_heart_empty));
		list.add(new DummyModel(2, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/2.jpg", "Jane Smith", R.string.fontello_heart_empty));
		list.add(new DummyModel(3, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/3.jpg", "Jane Smith", R.string.fontello_heart_empty));
		list.add(new DummyModel(4, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/4.jpg", "Jane Smith", R.string.fontello_heart_empty));
		list.add(new DummyModel(5, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/5.jpg", "Jane Smith", R.string.fontello_heart_empty));
		list.add(new DummyModel(6, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/6.jpg", "Jane Smith", R.string.fontello_heart_empty));
		list.add(new DummyModel(7, "http://pengaja.com/uiapptemplate/newphotos/listviews/googlecards/travel/7.jpg", "Jane Smith", R.string.fontello_heart_empty));
		
		return list;
	}
	
	public static ArrayList<DummyModel> getDummyModelListTravel() {
		ArrayList<DummyModel> list = new ArrayList<>();

		list.add(new DummyModel(0, "", "Joe's restaurant", R.string.fontello_heart_empty));
		list.add(new DummyModel(1, "", "Good restaurant", R.string.fontello_heart_empty));
		list.add(new DummyModel(2, "", "Express restaurant", R.string.fontello_heart_empty));
		list.add(new DummyModel(3, "", "Mine restaurant", R.string.fontello_heart_empty));
		list.add(new DummyModel(4, "", "Love restaurant", R.string.fontello_heart_empty));
		list.add(new DummyModel(5, "", "Story restaurant", R.string.fontello_heart_empty));
		
		return list;
	}
	
	public static ArrayList<DummyModel> getTravelDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, "", "Where To Go", R.string.material_icon_go));
		list.add(new DummyModel(1, "", "Where To Sleep", R.string.material_icon_sleep));
		list.add(new DummyModel(2, "", "Where To Eat", R.string.material_icon_eat));
		list.add(new DummyModel(3, "", "Where To Drink", R.string.material_icon_drink));
		list.add(new DummyModel(4, "", "Where To Party", R.string.material_icon_party));
		list.add(new DummyModel(5, "", "Where To Play", R.string.material_icon_play));
		list.add(new DummyModel(6, "", "Where To Shop", R.string.material_icon_shop));
		return list;
	}
	
	//TODO Change to social
	public static ArrayList<DummyModel> getSocialDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, "", "Friends", R.string.material_icon_account));
		list.add(new DummyModel(1, "", "Enemies", R.string.material_icon_account));
		list.add(new DummyModel(2, "", "Natural", R.string.material_icon_account));
		list.add(new DummyModel(3, "", "Family", R.string.material_icon_account));
		list.add(new DummyModel(4, "", "Guests", R.string.material_icon_account));
		list.add(new DummyModel(5, "", "Students", R.string.material_icon_account));
		return list;
	}
	
	//TODO Change to media
	public static ArrayList<DummyModel> getMediaDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, "", "", R.string.material_icon_go));
		list.add(new DummyModel(1, "", "", R.string.material_icon_sleep));
		list.add(new DummyModel(2, "", "", R.string.material_icon_eat));
		list.add(new DummyModel(3, "", "", R.string.material_icon_drink));
		list.add(new DummyModel(4, "", "", R.string.material_icon_party));
		list.add(new DummyModel(5, "", "", R.string.material_icon_play));
		list.add(new DummyModel(6, "", "", R.string.material_icon_shop));
		return list;
	}
	
	//TODO Change to shopping
	public static ArrayList<DummyModel> getShoppingDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, "", "", R.string.material_icon_go));
		list.add(new DummyModel(1, "", "", R.string.material_icon_sleep));
		list.add(new DummyModel(2, "", "", R.string.material_icon_eat));
		list.add(new DummyModel(3, "", "", R.string.material_icon_drink));
		list.add(new DummyModel(4, "", "", R.string.material_icon_party));
		list.add(new DummyModel(5, "", "", R.string.material_icon_play));
		list.add(new DummyModel(6, "", "", R.string.material_icon_shop));
		return list;
	}
	
	//TODO Change to news
	public static ArrayList<DummyModel> getNewsDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, "", "", R.string.material_icon_go));
		list.add(new DummyModel(1, "", "", R.string.material_icon_sleep));
		list.add(new DummyModel(2, "", "", R.string.material_icon_eat));
		list.add(new DummyModel(3, "", "", R.string.material_icon_drink));
		list.add(new DummyModel(4, "", "", R.string.material_icon_party));
		list.add(new DummyModel(5, "", "", R.string.material_icon_play));
		list.add(new DummyModel(6, "", "", R.string.material_icon_shop));
		return list;
	}

	private static String babBoujloudDescription = "Construite une première fois au XIème siècle," +
			" elle a été restaurée et réaménagée à plusieurs reprises.\n" +
			" En 1913, sous le règne du Sultan Alaouite Moulay Hafid," +
			" cette porte a été décorée en céramique émaillée, bleue d’un côté et" +
			" verte de l autre. \n" +
			"La face bleue de la porte donne sur l extérieur de la Médina";
	private static String fontaineNejjarineDescription = "La fontaine Nejjarine est la plus belle des 70 fontaines publiques que compte Fès. ";
	private static String palaisElMokriDescription = "Le palais El Mokri fait partie du patrimoine du Maroc.\n" +
			"Construit en plein médina," +
			" il reflète l art ancestral du Maroc qui peut s\\'en orgueillir" +
			" d avoir une vingtaine de palais à la médina de Fès." +
			" Quelques uns ont gardé leur cachet d époque ou on peut aussi admirer" +
			" la finesse du travail du bois," +
			" des zelliges et du plâtre (escaliers et mobiliers...)" +
			" des menuisiers ébénistes ou encore la délicatesse des fers forgés" +
			" véritablement sculptés aux scalpels par des maîtres forges qui étaient" +
			" des artistes remarquables.\n" +
			"Le dallage de marbre blanc (de carrare) et noir se disputent" +
			" l attention avec de riches revêtements de mosaïques en céramique" +
			" finement découpées, les plafonds et coupoles sculpté et peint," +
			" les menuiseries baroques serties de verres sablés de Venise" +
			" et de couleur de Bagdad.";
	private static String borjNordDescription = "Le Borj Nord est un fort élevé en 1588 au nord de Fès, au Maroc, sur ordre du sultan Ahmed al-Mansur,\n" +
			" dont le plan s inspire de l architecture des forteresses portugaises du xvie siècle.\n" +
			" Il était l un des plus grands postes de surveillance de la ville de Fès et servait " +
			" également de fabrique de canons.\n" +
			"De plan carré, les quatre coins sont dotés de quatre bastions en forme de fers de lance.\n" +
			"La terrasse est conçue de manière à résister au poids et aux tirs des canons.\n" +
			"Ayant servi de caserne puis de prison du temps du Protectorat français," +
			" le monument abrite depuis 1963 le Musée des Armes.\n" +
			"aussi Borj Sud, Borj Touil, Borj Sidi Bounafaa, Borj Cheikh Ahmed";

	public static ArrayList<DummyModel> getMonumentsDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.0617199, -4.9846022, "Bab Boujloud", "http://www.maroc-maroc.com/places/img45.jpg", "Bab Boujloud", babBoujloudDescription, R.string.material_icon_go));
		list.add(new DummyModel(1, 34.0648044, -4.9781887, "Fontaine Nejjarine", "https://media-cdn.tripadvisor.com/media/photo-s/03/e0/65/2e/fontaine-nejjarine.jpg", "Fontaine Nejjarine", fontaineNejjarineDescription, R.string.material_icon_sleep));
		list.add(new DummyModel(2, 34.0591279, -4.978817, "Palais El Mokri", "http://palaiselmokri.com/images/dar1/pa1g.jpg", "Palais El Mokri", palaisElMokriDescription, R.string.material_icon_eat));
		list.add(new DummyModel(3, 34.0672336, -4.9872073, "Borj Nord", "http://static.panoramio.com/photos/original/24027986.jpg", "Borj Nord", borjNordDescription, R.string.material_icon_drink));
		return list;
	}

	private static String KairaouineMosqueDescription = "Al Quaraouiyine (en arabe : القرويين) est une université située à Fès, au Maroc.\n" +
			"Selon la tradition, sa construction débute en 859 sous le règne de la dynastie idrisside.\n" +
			"Elle est considérée comme l une des plus anciennes universités dans" +
			" le monde encore en activité1.";
	private static String MedersaBouInaniaDescription = "La Médersa Bou Inania (arabe المدرسة أبو عنانية بفاس)" +
			" est une médersa édifiée à Fès, au Maroc, entre 1350 et 1355 pour" +
			" le sultan Abou Inan Faris (r. 1348 - 59)," +
			"soit sous la dynastie des Mérinides.\n" +
			" Elle est la seule médersa de la ville comportant un minaret," +
			" et elle jouxtait aussi des boutiques permettant son financement," +
			" ainsi que de vastes latrines, qui témoignent de son caractère public.\n" +
			"En effet, la médersa fonctionnait aussi bien comme une école" +
			" que comme mosquée du vendredi.";
	private static String AttarinMedersaDescription = "La Médersa Attarine est une ancienne école coranique de Fès au Maroc.\n" +
			"Elle fut construite entre 1323 et 1325 par le sultan mérinide Abou Saîd Othman.\n" +
			"Elle fut nommée d après le Souk de parfums et d épices attenant," +
			" Souk El Attarine. Elle se situe à proximité de la Quaraouiyine1";

	public static ArrayList<DummyModel> getHistoriqueDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.064919,  -4.9755786, "Kairaouine Mosque", "http://www.medias24.com/images/photos_artices/big/qaraouiyine.jpg", "Kairaouine Mosque", KairaouineMosqueDescription, R.string.material_icon_go));
		list.add(new DummyModel(1, 34.0622501, -4.9848927, "Medersa Bou Inania", "https://upload.wikimedia.org/wikipedia/commons/a/a1/Bou_Inania_Madrasa_2011.jpg", "Medersa Bou Inania", MedersaBouInaniaDescription, R.string.material_icon_sleep));
		list.add(new DummyModel(2, 34.0650832, -4.9759222, "Attarin Medersa", "http://blog.juliehall.net/wp-content/uploads/2011/06/fez-medersa-4.jpg", "Attarin Medersa", AttarinMedersaDescription, R.string.material_icon_eat));
		return list;
	}

	private static String LancienneMedinaFèsDescription = "";
	private static String FesMellahDescription = "";
	private static String FesJdidDescription = "";
	private static String BoujloudSquareDescription = "";

	public static ArrayList<DummyModel> getTourismeDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 12, 150, "L'ancienne Médina de Fès", "http://p5.storage.canalblog.com/59/72/409639/30595950_p.jpg", "l'ancienne Médina de Fès", "", R.string.material_icon_go));
		list.add(new DummyModel(1, 12, 150, "Fés Mellah", "http://img.actualidadviajes.com/wp-content/uploads/2012/07/fez.jpg", "Fés Mellah", "", R.string.material_icon_sleep));
		list.add(new DummyModel(2, 12, 150, "Fés el-Jdid", "http://static.yabiladi.com/files/articles/670521195b6b22b5bc994f4fa1e38edb350.jpg", "Fés el-Jdid", "", R.string.material_icon_eat));
		list.add(new DummyModel(3, 12, 150, "Boujloud Square", "http://static1.squarespace.com/static/527679aee4b06f1a7db2bffd/t/54e350d9e4b0a566f12e3c15/1424183525043/Fez+Morocco?format=1000w", "Boujloud Square", "", R.string.material_icon_drink));
		return list;
	}

	private static String ComplexeSportifDescription = "Le Complexe sportif de Fès est un stade de football localisé dans" +
			" la ville de Fès et plus précisément sur la route menant à Sefrou," +
			" il est d un style architectural typiquement marocain." +
			"Situé sur une superficie de 40 hectares," +
			" le complexe sportif de Fès peut accueillir 37 000 spectateurs tous assis.\n" +
			"Il est doté d une piste d athlétisme" +
			" en tartan outre des annexes susceptibles" +
			" d accueillir des compétitions de haut niveau.";
	private static String ClubsFootballDescription = "La ville de Fés est représentée par deux équipes de football," +
			" la première est le Wydad athlétique de Fès WAF fondée en 1948 est" +
			" joue actuellement en deuxième division du championnat marocain," +
			" la seconde est le Maghreb Association sportive de Fès" +
			" (en arabe : المغرب الرياضي الفاسي) qui est un club omnisports" +
			" marocain fondé en 1946. Le MAS est la première équipe marocaine" +
			" à atteindre les seizièmes de finale de la Coupe de France en" +
			" 1954 contre Red Star à lépoque à Paris.\n" +
			"Le MAS est un des clubs les plus titrés du royaume," +
			" avec un palmarès remarquable : Championnat du Maroc : (4)";

	public static ArrayList<DummyModel> getSportsDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.0023125, -4.9716972, "Complexe sportif de Fès", "http://www.somagec.ma/galerie/91-0.jpg", "Complexe sportif de Fès", ComplexeSportifDescription, R.string.material_icon_go));
		list.add(new DummyModel(1, 34.0024394, -5.0564692, "Clubs de football", "http://www.festourism.org/images/football.jpg", "Clubs de football", ClubsFootballDescription, R.string.material_icon_sleep));
		return list;
	}

	//Where sleep
	private static String BarceloDescription = "Accueil professionnel à la réception, " +
			"chambre très grande avec vue sur place principale. 1073 MAD la nuit, Excellente insonorisation.\n " +
			"Wifi top dans tout l'hotel. Parking gratuit si vous réservez sur un site sur Internet.";
	private static String IbisFesDescription = "Établi à quelque 15 km de l'aéroport Fès-Saïss et à " +
			"3 minutes à pied de la gare de Fès, l'hôtel ibis de Fès constitue une excellente " +
			"base pour explorer le centre-ville. \n" +
			"Dans un rayon de 3 km, vous aurez l'occasion d'admirer le palais royal, " +
			"les jardinsJnan Sbil, Bab Boujloud (la porte Bleue), la médersa Bou Inania, " +
			"le vieux quartier de Fès el-Bali et la fameuse médina de Fès. \n" +
			"Un peu plus loin, vous trouverez aussi le mausolée de Mouley Idriss, " +
			"la place Seffarine et les souks El Attarine et Nejjarine.";
	private static String RiadAlkantaraDescription = "Une fantastique oasis de paix sous " +
			"la forme d'une maison d'hote et spa à Fes au " +
			"Maroc. à 360 MAD la nuit";

	public static ArrayList<DummyModel> getHotelsDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.04409, -4.997014, "Barcelo Fes Medina", "http://cls.cdn-hotels.com/hotels/5000000/4670000/4668700/4668670/4668670_20_b.jpg", "Barcelo Fes Medina", BarceloDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.24750, -4.9716972, "Ibis Fes", "http://www.ahstatic.com/photos/2033_ho_00_p_1024x768.jpg", "ibis Fes", IbisFesDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0023125, -4.9716972, "Riad Alkantara", "http://www.anatoliansky.co.uk/_cmsimages/El%20Yacout%203%20Edit.jpg", "Riad Alkantara", RiadAlkantaraDescription, R.string.material_icon_go));
		return list;
	}

	private static String AUBERGEREDADescription = "L'Auberge de Jeunesse se trouve à 6 km du centre ville de Fès, dans une zone forestière d’une superficie de 2 hectares construites et de 5 hectares en mitoyenneté. \n" +
			"L'Auberge de Jeunesse comprend 75 lits avec air conditionné, TV, parabole, mini-bar, terrasse…";
	private static String DarRabhaDescription = "Dar Rabha, l'endroit idéal pour vous plonger dans les parfums et les sons de la médina de Fès, " +
			"cette maison est simple et charmant dans le cœur de la capitale spirituelle du Maroc.";

	public static ArrayList<DummyModel> getAubergesDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.056715, -4.9928965, "AUBERGE DE JEUNESSE FESFES REDA", "http://ekladata.com/WEu_Lued0CPoHJ_cwcorlruLzPs.jpg", "AUBERGE DE JEUNESSE FES REDA", AUBERGEREDADescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0613494, -4.9842495, "Dar Rabha", "http://www.darrabha.com/images/homeSlider/2.jpg", "Dar Rabha", DarRabhaDescription, R.string.material_icon_go));
		return list;
	}

	public static String RiadTaryanaDescription = "Nous vous accueillerons et vous guiderons pour faire de votre séjour à Fès un moment inoubliable et d’exception.\n" +
			"Bonnes adresses, conseils, bons plans, explications détaillées, recommandations. \nVous découvrirez l’art de vivre marocain.\n" +
			"Car au Riad Taryana tout est fait pour vous détendre et mettre vos sens en éveil.";
	public static String RiadFesPalaceteDescription = "Riad Fes Palacete est une des établissement les plus recunue dans le domaine de l'hébergement ....\n" +
			"Notre équipe d'interventions est hautement qualifié...";
	public static String RiadLallaFatimaDescription = "Le Riad lalla fatima est situé dans la médina, en plein cœur de la vieille ville de Fès, et à seulement 20 mètres de la porte du Bab Ziat.";

	public static ArrayList<DummyModel> getRiadsDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.0624939, -4.9846065, "Riad Taryana", "http://riadtaryana.com/images/slide/19.jpg", "Riad Taryana", RiadTaryanaDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0599892, -4.9785075, "Riad Fes Palacete", "http://www.riadfespalacete.com/images/1.jpg", "Riad Fes Palacete", RiadFesPalaceteDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0611891, -4.9829586, "Riad Lalla Fatima", "http://www.riadlallafatima.com/wp-content/uploads/2014/08/r11.jpg", "Riad Lalla Fatima", RiadLallaFatimaDescription, R.string.material_icon_go));
		return list;
	}

	public static String ChickenSpotDescription = "Chicken spot. Toute l'équipe du restaurant Chicken Spot sera heureuse de vous accueillir. Notre terrasse est ... 4 avenue Hassan II V.N Fes. 05 35 65 02 09.";
	public static String MacDonaldsDescription = "Chaîne emblématique de restauration rapide proposant des menus de burgers-frites, des desserts et milk-shakes.\n" +
			"Adresse : Ville Nouvelle, Fès 30000, Maroc\n" +
			"Horaires : Ouvert aujourd'hui · Ouvert 24h/24";
	public static String TipicoDescription = "Tipico Pizza (Hay saada). Fast Food. Lot 12, Lotissement Jabri, magasin N° 1, Avenue Ibn El Atir, Fès, Maroc. +212 (0)5 35 60 24 54 / (0)5 35 53 11 12.";

	public static ArrayList<DummyModel> getFastFoodDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.0023125, -4.9716972, "Chicken spot", "https://entremidietdeux.files.wordpress.com/2012/05/1323885590155.jpg", "Chicken spot", ChickenSpotDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0443463, -4.9960245, "McDonald's", "http://sites.duke.edu/daw2014/files/2014/06/mcdonalds-fez.jpg", "McDonald's", MacDonaldsDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 33.5815954, -7.6285097, "Tipico", "http://www.blanee.com/uploads/pictures/000/120/770/large/e2b6afa17311a26f.jpg", "Tipico", TipicoDescription, R.string.material_icon_go));
		return list;
	}

	public static String MBFeSDescription = "MB Fes Si ce restaurant tendance mérite le voyage, c’est qu'il est tout simplement le plus beau dans le registre contemporain, et que sa cuisine est tout aussi exceptionnelle.";
	public static String LAMAISONBLEUEDescription = "Construite en 1915 à Fès, cette sublime demeure garde l'empreinte de son premier et éminent propriétaire, Mohammed El Abbadi, à la fois grand astrologue, juriste et professeur à l'université El Qaraouiyine. " +
			"\nL'impressionnante et rare bibliothèque lui ayant appartenu est toujours là rappelant la culture et le savoir qui régnaient autrefois dans cette demeure de Fès . La cuisine traditionnelle marocaine y est réalisée dans la plus pure tradition. " +
			"\nFine, élégante, elle est à la hauteur du lieu.";
	public static String KAITAIDescription = "Situé en face de l'Hôtel Jnan Palace de Fès, c'est l'alliance de la Thaïlande et du Japon qui se ressent à travers l'espace de nombreux salons, dont la décoration est zen, calme et linéaire. Le Kaï Taï vous propose désormais une cuisine thaïe maîtrisée, tout en ayant conservé ses spécialités japonaises : sushis, makis, sashimis, et california rolls. " +
			"\nUne très bonne alternative à Fès entre deux repas de cuisine marocaine.";
	public static String ZENGARDENDescription = "Le Zen Garden est l'adresse située dans la ville nouvelle près de Fès City Center. Les propriétaires sont omniprésents en salle, comme en cuisine. \n" +
			"Le résultat donne une cuisine internationale goûteuse et raffinée, une clientèle chouchoutée, dans un très joli cadre avec un lounge à l'étage et deux terrasses.";

	public static ArrayList<DummyModel> getRestorantsDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.0336177, -5.0056991, "MB FÈS", "http://www.bestrestaurantsmaroc.com/public/images/image_list/63d1b176eef6312edd821f2676a486ef_head_format.jpg", "MB FÈS", MBFeSDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0336883, -5.03853, "LA MAISON BLEUE", "http://www.bestrestaurantsmaroc.com/public/images/image_list/be57617983fe11ee1ed7382a17f25f97_head_format.jpg", "LA MAISON BLEUE", LAMAISONBLEUEDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0322799, -5.0065654, "KAÏ TAÏ", "http://www.bestrestaurantsmaroc.com/public/images/image_list/d8405767d382840c539c5eb44d3b22de_head_format.jpg", "LA TERRASSE", KAITAIDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0372699, -5.0156464, "ZEN GARDEN", "http://www.bestrestaurantsmaroc.com/public/images/image_list/01ade148ac9a63c825415a08beb7007c_head_format.jpg", "ZEN GARDEN", ZENGARDENDescription, R.string.material_icon_go));
		return list;
	}

	public static String AndalousDescription = "Andalous est la combinaison d'un monde d'exception de fusion de styles et d’ambiances. " +
			"\nSes deux étages, ses ambiances diverse et variées lui donnent une personnalité hors du commun.";

	public static ArrayList<DummyModel> getDummyBistrotList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.020617, -4.998823, "Andalous", "http://media-cdn.tripadvisor.com/media/photo-s/05/d4/96/41/andalous.jpg", "Andalous", AndalousDescription, R.string.material_icon_go));
		return list;
	}

	public static String BarcelonaCafeDescription = "Ce café Barcelona et un endroit sympa pleins de jeunes s'y retrouvent pour dialoguer chanter quelques chanson avec guitare ou tam tam trés sympa comme endroit";
	public static String Le44Description = "Le 44 est bien fléché et bien situé pour une petite pause dans la Medina. " +
			"\nL'accueil y est très sympathique. " +
			"\nQue ce soit le plat du jour ou les menus simples proposés, tout est bien préparé et présenté.";
	public static String LAVILLADescription = "LA VILLA: boulangerie pâtisserie à Fès, elle vous propose une variété de pâtisseries de style marocain et international. " +
			"\nRestaurant glacier La villa à Fes.";
	public static String LaSuiteDescription = "Café La Suite. " +
			"\nCoffee Shop, Café et Restaurant français. " +
			"\nRoute Imouzzar, Fès, Maroc. " +
			"\nItinéraire. Heures: Aucun répertorié (Voir à quel moment les utilisateurs ...";

	public static ArrayList<DummyModel> getCaffeDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.0632534, -4.9839309, "Café Barcelona", "https://media-cdn.tripadvisor.com/media/photo-s/02/4d/41/bc/filename-384746-173376929418171.jpg", "Café Barcelona", BarcelonaCafeDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.062919, -4.9851349, "Le 44", "https://media-cdn.tripadvisor.com/media/photo-s/02/c4/64/cb/le-44-cafe-restaurant.jpg", "Le 44", Le44Description, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0159056, -5.0165925, "LA VILLA", "http://www.blanee.com/uploads/pictures/000/076/878/large/2561316cc09cb2bd.jpg", "LA VILLA", LAVILLADescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 33.9933262, -4.9968481, "La Suite", "http://www.lasuitefes.com/wp-content/uploads/galleryimages/4T5Kj2KIJHOFU84T.jpg", "La Suite", LaSuiteDescription, R.string.material_icon_go));
		return list;
	}

	public static String FesCountryClubDescription = "";
	public static String FelixClubFesDescription = "";
	public static String ActOrNightClubDescription = "";

	public static ArrayList<DummyModel> getClubsDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.0398981, -5.0467706, "Fès Country Club", "https://i.ytimg.com/vi/nps5_yrfCsc/maxresdefault.jpg", "Fès Country Club", FesCountryClubDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0416813, -5.0209607, "Felix Club Fes", "http://vampire-fes-3as.vip-blog.com/medias/0906/900524549201075[1].jpg", "Felix Club Fes", FelixClubFesDescription, R.string.material_icon_go));
		list.add(new DummyModel(0, 34.0486458, -4.9950456, "ActOr's Night-club", "http://www.blanee.com/uploads/pictures/000/091/626/large/d92012a1838588f0.jpg", "ActOr's Night-club", ActOrNightClubDescription, R.string.material_icon_go));
		return list;
	}

	public static String Description = "";

	public static ArrayList<DummyModel> getDummyList() {
		ArrayList<DummyModel> list = new ArrayList<>();
		list.add(new DummyModel(0, 34.0023125, -4.9716972, "", "", "", ComplexeSportifDescription, R.string.material_icon_go));
		return list;
	}
}
