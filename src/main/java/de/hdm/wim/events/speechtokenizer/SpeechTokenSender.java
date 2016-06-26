package de.hdm.wim.events.speechtokenizer;

import de.hdm.wim.events.model.DocumentForSpeechTokenizer;
import de.hdm.wim.events.restclient.BaseRestClient;

/**
 * 
 * Class used to post Documents to the SpeechToken component
 * 
 * @author Jens Lindner, Max Harhoff, Sebastian Vaas, Stefan Sigel
 *
 */
public class SpeechTokenSender {

	public static final String SPEECH_TOKENIZER_URL = "SPEECH_TOKENIZER_URL"; //FIXME: set actual URL
	
	//FIXME: needs to send actual Document instead of just printing it out
	public void sendDocument(DocumentForSpeechTokenizer document) {
		//BaseRestClient restClient = new BaseRestClient(SPEECH_TOKENIZER_URL);
		//restClient.doPost("document", document);
		System.out.println("SpeechTokenSende sending the following Document: " + document);
	}
}
