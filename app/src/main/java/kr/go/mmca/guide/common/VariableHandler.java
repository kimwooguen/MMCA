package kr.go.mmca.guide.common;

import java.util.ArrayList;
import java.util.List;

import kr.go.mmca.guide.data.Article;
import kr.go.mmca.guide.data.BeaconList;
import kr.go.mmca.guide.data.Guide;
import kr.go.mmca.guide.data.Notice;
import kr.go.mmca.guide.data.Poi;
import kr.go.mmca.guide.data.Product;

public class VariableHandler {
	public static final String NAME_SPACE = "kr.go.mmca.guide";
	public static final String COMMUNICATION_ERROR_CODE = "N999";
	public static final int DISPLAY_320 = 320;

	public static final int WEBSERVICE_TIMEOUT_CONNECTION = 35000;
	public static final int WEBSERVICE_TIMEOUT_SOCKET = 10000;

	//도메인 : audio.mmca.go.kr
	//웹서비스 주소
	//public static final String WEBSERVICE_URL = "http://192.168.0.72:8080/mmca/";
	//public static final String WEBSERVICE_URL = "http://211.170.61.130/mmca/";
	public static final String WEBSERVICE_URL = "https://audio.mmca.go.kr/mmca/";

	//GEO DB 파일
	public static final String D_GEO_DB_PATH = "/data/data/" + NAME_SPACE + "/files/MMCA_D.db"; //덕수궁관
	public static final String G_GEO_DB_PATH = "/data/data/" + NAME_SPACE + "/files/MMCA_G.db"; //과천관
	public static final String S_GEO_DB_PATH = "/data/data/" + NAME_SPACE + "/files/MMCA_S.db"; //서울관

	public static final String D_GEO_CONFIG_PATH = "/data/data/" + NAME_SPACE + "/files/BUILDCDDS.config"; //덕수궁관
	public static final String G_GEO_CONFIG_PATH = "/data/data/" + NAME_SPACE + "/files/BUILDCDGC.config"; //과천관
	public static final String S_GEO_CONFIG_PATH = "/data/data/" + NAME_SPACE + "/files/BUILDCDSE.config"; //서울관


	//선택된 관코드()
	public static String SelectedExhibitHall = "BUILDCDGC"; //1 : 과천관(BUILDCDGC), 2 : 서울관(BUILDCDSE) , 3: 덕수궁관(BUILDCDDS)

	//선택된 언어코드(1: 국문, 2:영문)
	public static String SelectLanguageCode = "LANGUAGE01"; //한국어 : LANGUAGE01, 영어: LANGUAGE02

	//실시간 방식 : 1, 다운로드 방식 : 2
	public static int PlayType = 1;

	public static  List<Product> globalProductList = new ArrayList<Product>();
    public static Product globalSelectedProduct;
	public static Guide globalSelectedGuide;
	public static String globalPlayGuideItem = ""; //현재 플레이하고 있는 가이드아이템

	public static  List<Article> globalArticleList;
	public static Article globalSelectedArticle;

	public static List<Article> globalPlayArticleList = new ArrayList<Article>();
	public static boolean globalDirectPlay = false;
	//공지사항
	public static  List<Notice> globalNoticeList;

	//푸쉬관련
	public static String gcmTokenID = "";   //푸쉬토큰ID
	public static String gcmMsgID = "";   //푸쉬MsgID
	public static String gcmUrl = "";   //푸쉬URL
	public static String gcmPushKey = "";   //푸쉬KEY

	public static int SelectBlueTooth = 0;

	public static boolean serviceBound = false;

	public static List<Poi> globalPoiList;

	public static String appURL = "https://play.google.com/store/apps/details?id=kr.go.mmca.guide";

	public static String SelectedPoiType = "1"; //1:전시실, 2:편의시설
}
