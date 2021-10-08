package com.example.ttrgamestate;

import java.util.ArrayList;

//ticket to ride actions implemented by Ian Thompson, Bruce Baird, Trent Matsushima, and Jennifer Brana
public class TTRGameAction {




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
