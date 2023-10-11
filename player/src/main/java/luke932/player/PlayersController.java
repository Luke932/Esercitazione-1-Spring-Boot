package luke932.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayersController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getPlayer(@PathVariable int id) {
        return playerService.getPlayer(id);
    }

    @PostMapping("/players")
    public void addPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
    }

    @PutMapping("/players/{id}")
    public void updatePlayer(@PathVariable int id, @RequestBody Player player){
        playerService.updatePlayer(id, player);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable int id){
        playerService.deletePlayer(id);
    }
}
