package com.example.ttrgamestate;

import java.util.ArrayList;

public class TTRGameAction {




    public boolean placeTrains(Player player, Path path, int wilds, TTRGameState.CARD card){
        int len = path.getLength();
        int owner = player.getColor();
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

    public boolean drawTickets(TTRGameState gameState, Player player){
        if(gameState.ticketDeckEmpty()){
            return false;
        } else {
            Ticket[] ticket = gameState.getTickets();
            for (int i = 0; i < 3; i++) {
                player.addTicket(ticket[i]);
            }
            return true;
        }
    }

    public boolean drawCards(TTRGameState gameState, Player player, TTRGameState.CARD c, TTRGameState.CARD c1){
        ArrayList<TTRGameState.CARD> deck = gameState.getCardDeck();
        if(deck.isEmpty()){
            return false;
        } else{
            deck.remove(c);
            deck.remove(c1);
            player.addCardHand(c);
            player.addCardHand(c1);
            gameState.setCardDeck(deck);
            return true;

        }

    }

}
