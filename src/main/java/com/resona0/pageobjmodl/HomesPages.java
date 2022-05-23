
/**
 * This is program for Page Object Model
 */

package com.resona0.pageobjmodl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonance.keywords12.UIkeywords12;

public class HomesPages {
	UIkeywords12 keywords = new UIkeywords12();

	// @FindBy(css="a[href=\"/assignments\"]")
	public WebElement assignmentLnk;
	// @FindBy(css="a.sf-with-ul")
	public WebElement coursesLnk;
	// @FindBy(css=" li:nth-child(4)
	// a[href=\"https://www.youtube.com/channel/UCg_SUG_BAPtVUvTSKse2xBg\"]")
	public WebElement videosLnk;

	// Without page factory and @FindBy && locator ahe he
	public By assignmentLink = By.cssSelector("a[href=\"/assignments\"]");

	@FindBy(css = "a[href=\"/notes\"]")
	public WebElement notesLnk;
	@FindBy(css = "a[href=\"/recent-placements\"]")
	public WebElement recentPalcementsLnk;

	public HomesPages() {
		UIkeywords12 keyword = new UIkeywords12();
		PageFactory.initElements(keyword.driver, this);
	}

	public void clickOnAssignments() {
		assignmentLnk.click(); // this is page object

	}

	// Without @FindBy and Page Factory
	public void clickOnAssignmentMenu() {
		keywords.driver.findElement(assignmentLink).click();
	}
}
