package com.example.ttrgamestate;

import java.util.ArrayList;
import java.util.Random;

//ticket to ride actions implemented by Ian Thompson, Bruce Baird, Trent Matsushima, and Jennifer Brana
public class TTRGameAction {

    public TTRGameAction(){

    }




    public boolean drawTrain(Player player, TTRGameState.CARD card, TTRGameState.CARD card1, TTRGameState state){

        if(state.getCardDeck().isEmpty()){
            return false;
        } else {
            ArrayList<TTRGameState.CARD> deck = state.getCardDeck();
            player.addCardHand(card);
            player.addCardHand(card1);
            deck.remove(card);
            deck.remove(card1);
            state.setCardDeck(deck);
            return true;
        }

    }

    public boolean drawTicket(Player player, TTRGameState state){
        if(state.ticketDeckEmpty()){
            return false;
        } else {
            Random rand = new Random();
            Ticket[] deck = state.getTickets();
            for(int i = 0; i < deck.length; i++){
                player.addTicket(deck[i]);
            }
            return true;
        }
    }

    public boolean placeTrains(Player player, Path path, int wilds, TTRGameState.CARD card){
        int len = path.getLength();
        int owner = player.getName();
        if(wilds > player.getWildCards()){
            return false;
        }
        if(wilds > path.getLength()){
            return false;
        }
        if(path.getPathOwner() != -1){
              return false;
        }

        if(len > player.getNumTrains()){
              return false;
        }

        switch (path.getPathColor()) {
            case GREYPATH:
                switch (card) {
                    case WILDCARD:
                        if (wilds < len) {
                            return false;
                        } else {
                            for (int i = 0; i < wilds; i++) {
                                player.removeCardHand(TTRGameState.CARD.WILDCARD);
                            }
                            path.setPathOwner(owner);
                            return true;
                        }
                    case PINKCARD:
                        if ((wilds + player.getPinkCards()) < len) {
                            return false;
                        } else {
                            for (int i = 0; i < wilds; i++) {
                                player.removeCardHand(TTRGameState.CARD.WILDCARD);
                                len--;
                            }
                            for (int i = 0; i < len; i++) {
                                player.removeCardHand(TTRGameState.CARD.PINKCARD);
                            }
                            path.setPathOwner(owner);
                            return true;
                        }
                    case BLACKCARD:
                        if ((wilds + player.getBlackCards()) < len) {
                            return false;
                        } else {
                            for (int i = 0; i < wilds; i++) {
                                player.removeCardHand(TTRGameState.CARD.WILDCARD);
                                len--;
                            }
                            for (int i = 0; i < len; i++) {
                                player.removeCardHand(TTRGameState.CARD.BLACKCARD);
                            }
                            path.setPathOwner(owner);
                            return true;
                        }
                    case WHITECARD:
                        if ((wilds + player.getWhiteCards()) < len) {
                            return false;
                        } else {
                            for (int i = 0; i < wilds; i++) {
                                player.removeCardHand(TTRGameState.CARD.WILDCARD);
                                len--;
                            }
                            for (int i = 0; i < len; i++) {
                                player.removeCardHand(TTRGameState.CARD.WHITECARD);
                            }
                            path.setPathOwner(owner);
                            return true;
                        }
                    case ORANGECARD:
                        if ((wilds + player.getOrangeCards()) < len) {
                            return false;
                        } else {
                            for (int i = 0; i < wilds; i++) {
                                player.removeCardHand(TTRGameState.CARD.WILDCARD);
                                len--;
                            }
                            for (int i = 0; i < len; i++) {
                                player.removeCardHand(TTRGameState.CARD.ORANGECARD);
                            }
                            path.setPathOwner(owner);
                            return true;
                        }
                }
            case PINKPATH:
                if ((wilds + player.getPinkCards()) < len) {
                    return false;
                } else {
                    for (int i = 0; i < wilds; i++) {
                        player.removeCardHand(TTRGameState.CARD.WILDCARD);
                        len--;
                    }
                    for (int i = 0; i < len; i++) {
                        player.removeCardHand(TTRGameState.CARD.PINKCARD);
                    }
                    path.setPathOwner(owner);
                    return true;
                }
            case BLACKPATH:
                if ((wilds + player.getBlackCards()) < len) {
                    return false;
                } else {
                    for (int i = 0; i < wilds; i++) {
                        player.removeCardHand(TTRGameState.CARD.WILDCARD);
                        len--;
                    }
                    for (int i = 0; i < len; i++) {
                        player.removeCardHand(TTRGameState.CARD.BLACKCARD);
                    }
                    path.setPathOwner(owner);
                    return true;
                }
            case WHITEPATH:
                if ((wilds + player.getWhiteCards()) < len) {
                    return false;
                } else {
                    for (int i = 0; i < wilds; i++) {
                        player.removeCardHand(TTRGameState.CARD.WILDCARD);
                        len--;
                    }
                    for (int i = 0; i < len; i++) {
                        player.removeCardHand(TTRGameState.CARD.WHITECARD);
                    }
                    path.setPathOwner(owner);
                    return true;
                }
            case ORANGEPATH:
                if ((wilds + player.getOrangeCards()) < len) {
                    return false;
                } else {
                    for (int i = 0; i < wilds; i++) {
                        player.removeCardHand(TTRGameState.CARD.WILDCARD);
                        len--;
                    }
                    for (int i = 0; i < len; i++) {
                        player.removeCardHand(TTRGameState.CARD.ORANGECARD);
                    }
                    path.setPathOwner(owner);
                    return true;
                }


        }


        return false;
    }

}
