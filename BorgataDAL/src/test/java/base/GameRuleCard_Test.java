package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.GameRuleCardsDomainModel;

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
		grCards = GameRuleCardsDAL.getCardsRules();

		//Currently there are 47 entries in the table
		assertTrue(grCards.size() == 47);

		//Four correspond to RuleID = 1
		int counter = 0;
		for (GameRuleCardsDomainModel ggg : grCards) {
			if (ggg.getRULEID() == 1) {
				counter++;
			}
		}
		assertTrue(counter == 4);

		//Seven correspond to RuleID = 7
		counter = 0;
		for (GameRuleCardsDomainModel ggg : grCards) {
			if (ggg.getRULEID() == 7) {
				counter++;
			}
		}
		assertTrue(counter == 7);
	}

}
