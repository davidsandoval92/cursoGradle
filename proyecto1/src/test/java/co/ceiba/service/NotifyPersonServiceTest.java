package co.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import co.ceiba.domain.Person;
import co.ceiba.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {

	private NotifyPersonService notifyPersonService;
	private EmailService emailService;

	@Before
	public void setup() {
		emailService = new EmailService();//Mockito.mock(EmailService.class);
		notifyPersonService = new NotifyPersonService(emailService);
	}

	@Test
	public void notifyTest() {
		// Arrange
		//Mockito.when(emailService.sendEmail(Mockito.anyString())).thenReturn("hola mundo");
		Person person = new PersonTestDataBuilder().buil();
		// Act
		String message = notifyPersonService.notify(person);
		System.out.println(message);
		// Assert
		//Assert.assertNotNull(message);
		Assert.assertNull(message);
	}

}
