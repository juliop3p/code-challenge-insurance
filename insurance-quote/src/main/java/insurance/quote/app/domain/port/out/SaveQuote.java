package insurance.quote.app.domain.port.out;


import insurance.quote.app.domain.entities.Quote;

public interface SaveQuote {
  Quote execute(Quote quote);
}
