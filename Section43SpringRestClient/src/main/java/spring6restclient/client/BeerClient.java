package spring6restclient.client;

import spring6restclient.model.BeerDTO;
import spring6restclient.model.BeerStyle;
import org.springframework.data.domain.Page;

import java.util.UUID;


public interface BeerClient {
    Page<BeerDTO> listBeers();

    Page<BeerDTO> listBeers(String beerName, BeerStyle beerStyle, Boolean showInventory, Integer pageNumber,
                            Integer pageSize);

    BeerDTO getBeerById(UUID beerId);

    BeerDTO createBeer(BeerDTO newDto);

    BeerDTO updateBeer(BeerDTO beerDto);

    void deleteBeer(UUID beerId);
}
