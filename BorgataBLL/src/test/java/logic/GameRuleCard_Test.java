package logic;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.GameRuleCardsDomainModel;
import logic.GameRuleBLL;

public class GameRuleCard_Test {

	private static ArrayList<GameRuleCardsDomainModel> grCards;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void GetRules()
	{
		grCards = GameRuleCardsBLL.getCardsRules(1);
		
		//For an ID of 1, should return 4
		assertTrue(grCards.size() == 4);
		
		//Make sure this one works too
		HashMap<String, GameRuleCardsDomainModel> grCardsMap = GameRuleCardsBLL.getRuleCardsHashSet(1);
		assertTrue(grCardsMap.get("1").getNBROFCARDS() == 2);
	}
	
}
