/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling2;

import bowling.SinglePlayerGame;

/**
 *
 * @author c
 */
public class MultiPlayerGame implements bowling.MultiPlayerGame{
    
    String[] playerName;
    SinglePlayerGame[] player;
    int currentPlayer;

    @Override
    public String startNewGame(String[] playerName) throws Exception {
        currentPlayer = 0;
        if (playerName.length == 0 ){
            throw new IllegalArgumentException("Il doit y avoir au moins un joueur"); 
        }
        for( int i = 0; i < playerName.length; i++){
            player[i] =  new SinglePlayerGame();
        }
        playerName = playerName;
        return currentPlayerFrame();
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String currentPlayerFrame(){
        /*Prochain tir : joueur Bastide, tour n° 5, boule n° 1*/
        String str = "Prochain tir : ";
        str = str + "joueur " + playerName[currentPlayer];/*joueur Bastide*/
        str = str + ", tour n° " + player[currentPlayer].getCurrentFrame().getFrameNumber(); /*tour n° 5*/
        str = str + ", boule n° " + player[currentPlayer].getCurrentFrame().getBallsThrown();
        return str;
    }
}
