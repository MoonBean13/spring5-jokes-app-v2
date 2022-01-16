package moon.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	// TODO: Improve to make Spring Boot do the dependency injection, later
	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	 public String getJoke() {
		 return chuckNorrisQuotes.getRandomQuote();
	 }
	
}
