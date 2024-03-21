package ATDevservices.Assignment.Service;

import ATDevservices.Assignment.Model.Match;
import ATDevservices.Assignment.Model.Player;
import ATDevservices.Assignment.Repository.MatchRepository;
import ATDevservices.Assignment.Repository.PlayerRepository;
import Dto.Playerdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class Services {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private MatchRepository matchRepository;


    public void create(Playerdto playerdto){
        Player player = playerdto.dto();
//        Match match = matchRepository.save(player.getMatch());
//        player.setMatch(match);
        playerRepository.save(player);
    }
}
