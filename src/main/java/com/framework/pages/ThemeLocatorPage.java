package com.framework.pages;

import static com.framework.settings.ObjectRepo.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ThemeLocatorPage extends PageBase {
	

	private WebDriver driver;
	//WaitHelper wHelper = new WaitHelper(ObjectRepo.driver, null);
	

	public ThemeLocatorPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/** Web Elements */

	@FindBy(xpath = "(//*[@class='AvatarCardItem_root__3uQgq'])[1]")
	@CacheLookup
	public  WebElement exploreAndAskCard;
	
	@FindBy(xpath = "//*[text()='Next']")
	@CacheLookup
	public  WebElement nextButton;
	
	@FindBy(xpath = "//*[@class='TextInput_input__fCq2t TextInput_withBefore__m3zLc TextInput_withAfter__iLW91']")
	@CacheLookup
	public  WebElement searchBar;
	
	@FindBy(xpath = "//*[text()='Suggested questions for you']")
	@CacheLookup
	public  WebElement suggestionsField;
	
	@FindBy(xpath = "//*[text()='Popular questions']")
	@CacheLookup
	public  WebElement popularquestionsField;
	
	@FindBy(xpath = "//*[text()='My questions']")
	@CacheLookup
	public  WebElement myQuestionsField;
	
	@FindBy(xpath = "//*[text()='Person']")
	@CacheLookup
	public  WebElement personTab;
	
	@FindBy(xpath = "//*[text()='Person']")
	@CacheLookup
	public  WebElement themeTab;
	
	@FindBy(xpath = "(//*[@class='ImageCard_root__-qoiM ImageCard_theme-secondary__h96BK ImageCard_clickable__8iY9V TilesView_cardAppearAnimation__gHfSS'])[1]")
	@CacheLookup
	public  WebElement topicCard;
	
	@FindBy(xpath = "//*[@class='ResultsCard_answerContainer__15nKY']/*/h4")
	@CacheLookup
	public  List<WebElement> topPassages;
	
	@FindBy(xpath = "//*[@class='QuestionSuggestionItem_text__Ajv45']")
	@CacheLookup
	public  List<WebElement> suggestionQuestion;
	
	@FindBy(xpath = "//*[@class='ImageCard_title__Imu2p']//parent::*/*/*[@class='Chip_title__5+pg8']")
	@CacheLookup
	public  List<WebElement> NERTag;
	
	@FindBy(xpath = "(//*[@class='ImageCard_title__Imu2p']//h3)[1]")
	@CacheLookup
	public WebElement topicName;
	
	@FindBy(xpath = "(//*[@class='ImageCard_title__Imu2p']//h3)")
	@CacheLookup
	public List<WebElement> allTopic;
	
	@FindBy(xpath = "//*[@class='ResultsCard_answerContainer__LrpL+']//*//h4")
	@CacheLookup
	public List<WebElement> changedPassages;
	
	@FindBy(xpath = "(//*[@class='ImageCard_title__3xtrK']//h3)[1]")
	@CacheLookup
	public WebElement updatedtopicName;
	
	@FindBy(xpath = "//*[text()='Topic Trend']")
	@CacheLookup
	public  WebElement topicTrend;
	
	@FindBy(xpath = "//*[text()='Top Passages']")
	@CacheLookup
	public  WebElement topPassage;
	
	@FindBy(xpath = "//*[@class='TabsCollection_itemContainer__s9-3I']")
	@CacheLookup
	public  List<WebElement> themes;
	
	@FindBy(xpath = "//*[@class='Radio_root__+1sJp Radio_size-medium__t2nZx AvatarCardItem_radioButton__Mql3U']")
	@CacheLookup
	public  WebElement radioButton;
	
//	@FindBy(xpath = "(//*[@class='ImageCard_root__2FvFc ImageCard_theme-primary__2ADmd'])[1]")
//	@CacheLookup
//	public WebElement topicCards;
	
	@FindBy(xpath = "//*[@class='Chip_root__39ywK Chip_variant-rounded__wlMyu Chip_color-blue-solid__3whSc']//*[@class='Chip_title__2c-BL']")
	@CacheLookup
	public  List<WebElement> themeName;
	
	@FindBy(xpath = "//*[@class='Chip_root__39ywK Chip_variant-rounded__wlMyu Chip_color-secondary__3XoAu Chip_clickable__2UXA6 TopicTiles_chipTab__nTL6K']")
	@CacheLookup
	public  List<WebElement> allThemes;
	
	@FindBy(xpath = "(//*[text()='Environmental'])[1]")
	@CacheLookup
	public WebElement environmentalTopicTab;
	
	@FindBy(xpath = "(//*[@class='ImageCard_root__-qoiM ImageCard_theme-secondary__h96BK ImageCard_clickable__8iY9V TilesView_cardAppearAnimation__gHfSS'])[1]")
	@CacheLookup
	public WebElement environmentalTopic;
	
	@FindBy(xpath = "//*[@class='ResultsCard_answerContainer__LrpL+']//*//h4")
	@CacheLookup
	public List<WebElement> passageName;
	
	@FindBy(xpath = "(//*[@class='ResultsCard_answerContainer__15nKY']//*[@class='AnswerSection_title__2A-DN'])[1]")
	@CacheLookup
	public WebElement updatedpassageName;
	
	@FindBy(xpath = "(//*[@class='ImageCard_title__3xtrK'])[1]")
	@CacheLookup
	public  WebElement TopicName;

	@FindBy(xpath = "(//*[text()='Product Support']//parent::*[@class='AvatarCardItem_root__3uQgq'])[1]")
	@CacheLookup
	public  WebElement productSupport;
	
	@FindBy(xpath = "//*[text()='Environmental']")
	@CacheLookup
	public  WebElement environmentTab;
	
	@FindBy(xpath = "(//*[@class='QuestionSuggestionItem_text__Ajv45'])[1]")
	@CacheLookup
	public  WebElement suggestedQuestion;
	
	@FindBy(xpath = "//*[@class='TrendingChart_root__bRBxQ']")
	@CacheLookup
	public  WebElement trendingDataChart;
	
	@FindBy(xpath = "(//*[@class='AvatarCardItem_root__3uQgq'])[4]")
	@CacheLookup
	public  WebElement auditCard;
	
	@FindBy(xpath = "(//*[@class='Table_column__Hn3m5'])[4]")
	@CacheLookup
	public  WebElement sourcePassage;
	
	@FindBy(xpath = "//*[@class='TrendingChart_root__bRBxQ']")
	@CacheLookup
	public  WebElement trendingChart;
	
	@FindBy(xpath = "//*[@class='Title_root__eU152']")
	@CacheLookup
	public  WebElement connectedFile;
	
	@FindBy(xpath = "(//*[@class='Icon_icon__DouW- Icon_icon-arrow-down__h9YX7'])[1]")
	@CacheLookup
	public WebElement backIcon;
	
	@FindBy(xpath = "//*[@class='ImageCard_root__-qoiM ImageCard_theme-secondary__h96BK ImageCard_clickable__8iY9V TilesView_cardAppearAnimation__gHfSS']")
	@CacheLookup
	public List<WebElement> allTopics;
	
	@FindBy(xpath = "//*[@class='ImageCard_root__-qoiM ImageCard_theme-secondary__h96BK ImageCard_clickable__8iY9V TilesView_cardAppearAnimation__gHfSS']")
	@CacheLookup
	public  List<WebElement> topicCards;
	
	

}
