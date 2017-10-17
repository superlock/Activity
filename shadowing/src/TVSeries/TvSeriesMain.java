package TVSeries;

import java.util.ArrayList;
import java.util.List;

public class TvSeriesMain {

	public static void main(String[] args) {
		
		List<Cry> itemsThatCanCry = new ArrayList<Cry>();
		
		Cry americanTvSeriesThatMakesYouCry = new AmericanTvSeries();
		Cry koreanTvSeriesThatMakesYouCry = new KoreanTvSeries();
		
		itemsThatCanCry.add(americanTvSeriesThatMakesYouCry);
		itemsThatCanCry.add(koreanTvSeriesThatMakesYouCry);
		
		for(Cry item : itemsThatCanCry) {
			item.doCry();
		}
		
	}

}
