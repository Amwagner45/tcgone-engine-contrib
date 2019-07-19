package tcgwars.logic.impl.gen4;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import java.util.*;
import org.apache.commons.lang.WordUtils;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*;
import tcgwars.logic.card.pokemon.*;
import tcgwars.logic.card.trainer.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.ability.Ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum WorldCollection implements CardInfo {

	PIKACHU_P ("Pikachu", P, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PIKACHU_P ("Pikachu", P, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PIKACHU_P ("Pikachu", P, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PIKACHU_P ("Pikachu", P, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PIKACHU_P ("Pikachu", P, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PIKACHU_P ("Pikachu", P, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PIKACHU_P ("Pikachu", P, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PIKACHU_P ("Pikachu", P, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PIKACHU_P ("Pikachu", P, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
;

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	WorldCollection(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
		this.cardTypes = new CardTypeSet(cardTypes as CardType[]);
		this.name = name;
		this.rarity = rarity;
		this.collectionLineNo = collectionLineNo;
	}

	@Override
	public CardTypeSet getCardTypes() {
		return cardTypes;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Rarity getRarity() {
		return rarity;
	}

	@Override
	public int getCollectionLineNo() {
		return collectionLineNo;
	}

	@Override
	public tcgwars.logic.card.Collection getCollection() {
		return tcgwars.logic.card.Collection.WORLD_COLLECTION;
	}

	@Override
	public String toString() {
		return String.format("%s:%s", this.name(), this.getCollection().name());
	}

	@Override
	public String getEnumName() {
			return name();
	}

	@Override
	public Card getImplementation() {
		switch (this) {
			case PIKACHU_P:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Hello!", {
					text "Greet your opponent. Then, each player draws a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunderbolt", {
					text "60 damage. Discard all Energy attached to Pikachu."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_P:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Ciao!", {
					text "Saluta il tuo avversario. Poi ogni giocatore pesca una carta."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fulmine", {
					text "60 damage. "
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_P:
			return copy (PIKACHU_P, this)
			/*basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Hello!", {
					text "Greet your opponent. Then, each player draws a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunderbolt", {
					text "60 damage. Discard all Energy attached to Pikachu."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case PIKACHU_P:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "�Hola!", {
					text "Saluda a tu rival. Luego cada jugador roba una carta."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rayo", {
					text "60 damage. "
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_P:
			return copy (PIKACHU_P, this)
			/*basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Hello!", {
					text "Greet your opponent. Then, each player draws a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunderbolt", {
					text "60 damage. Discard all Energy attached to Pikachu."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			}*/;
			case PIKACHU_P:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Hallo!", {
					text "Begr��e deinen Gegner. Anschlie�end ziehen alle Spieler je eine Karte."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Donnerblitz", {
					text "60 damage. "
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_P:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Bonjour !", {
					text "Saluez votre adversaire. Ensuite, chaque joueur pioche une carte."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tonnerre", {
					text "60 damage. "
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_P:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Witaj! Przywitaj si? z przeciwnikiem", {
					text "Nast?pnie ka?dy z graczy dobiera kart?."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Piorun", {
					text "60 damage. "
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_P:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Ol�!", {
					text "Cumprimenta o teu advers�rio. Em seguida, cada jogador tira uma carta."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunderbolt", {
					text "60 damage. "
					energyCost L, L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
				default:
			return null;
		}
	}

}
