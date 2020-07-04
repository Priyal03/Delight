// List of suits in deck of cards
// let suits = ['Hearts', 'Diamonds', 'Clubs', 'Spades'];
let suits = ['Hearts', 'Diamonds'];
// List of values for a suit 7, 8, 9, 10, 11, 12, 13
let values = [1, 2, 3, 4, 5, 6 ];

const numberOfCardsDealt = 3;
const numberOfPlayers = 4;
let users = [];
let winingUser;

// Represents the actual card
class Card {
    constructor(suit, value) {
        this.suit = suit;
        this.value = value;
    }
}

// Represents a deck of cards - 52 cards
class Deck {
    constructor() {
        this.deck = [];
        this.resetTheDeck();
        this.shuffle();
    }

    // Reset a deck of cards in the standrd sorted order - K,Q,J,10,9 ... etc
    resetTheDeck() {
        this.deck = [];
        for (let suit of suits) {
            for (let value of values) {
                this.deck.push(new Card(suit, value));
            }
        }
        return this.deck;
    }

    // Shuffles the deck of card
    shuffle() {
        let remainingCardTobeShuffled = this.deck.length, randomCardSwapIndex;

        while (remainingCardTobeShuffled) {
            randomCardSwapIndex = Math.floor(Math.random() * remainingCardTobeShuffled--);

            [this.deck[remainingCardTobeShuffled], this.deck[randomCardSwapIndex]] = [this.deck[randomCardSwapIndex], this.deck[remainingCardTobeShuffled]];
        }

    }
    // Distribute the card
    deal() {
        return this.deck.pop();
    }
    renderDeck() {
        document.getElementById('deck').innerHTML = '';
        for (var i = 0; i < this.deck.length; i++) {
            var card = document.createElement("div");
            var value = document.createElement("div");
            var suit = document.createElement("div");
            card.className = "card";
            value.className = "value";
            suit.className = "suit " + this.deck[i].suit;

            value.innerHTML = this.deck[i].value;
            card.appendChild(value);
            card.appendChild(suit);

            document.getElementById("deck").appendChild(card);
        }
    }
}

class User {
    constructor() {
        this.cards = [];
        this.doesTripletExist = false;
        this.doesSequenceExists = false;
        this.doesPairExists = false;
    }
    sortTheCard() {
        this.sort = this.cards.sort((currentCard, nextCard) => currentCard.value - nextCard.value);
        console.log('sorted', this.cards);
    }
}
function load() {
    const deck1 = new Deck();
    console.log(deck1.deck);
    // deck1.renderDeck();
}
function startTheGame() {
    // distrubute the cards for te deck
    for (let cardsIterator = 0; cardsIterator < numberOfCardsDealt; cardsIterator++) {
        for (let userIterator = 0; userIterator < numberOfPlayers; userIterator++) {
            users[userIterator].cards.push(deck1.deal());
            // console.log(users[userIterator].cards)
        }

    }

    // console.log(users[0].cards,users[1].cards,users[2].cards,users[3].cards);
    // sort the card
    for (let userIterator = 0; userIterator < numberOfPlayers; userIterator++) {
        users[userIterator].sortTheCard();
        // console.log(users[userIterator].cards)
    }


    return declareTheWinner();
}
function findAllTheTriplets() {
    // for(let iterator=0;iterator<3;iterator)
    for (let userIterator = 0; userIterator < numberOfPlayers; userIterator++) {
        if ((users[userIterator].cards[0].value == users[userIterator].cards[1].value) && (users[userIterator].cards[1].value == users[userIterator].cards[2].value)) {
            users[userIterator].doesTripletExist = true;
            // already contians the winingUser
            if (winingUser) {

                if (winingUser.cards[0].value == users[userIterator].cards[0].value) {
                    // New card drawn for wining user 
                    let newCardForWiningUser = deck1.deal();
                    let newCardForCurrentUser = deck1.deal();
                    while (newCardForCurrentUser.value == newCardForWiningUser.value) {
                        newCardForWiningUser = deck1.deal();
                        newCardForCurrentUser = deck1.deal();
                    }
                    winingUser = newCardForWiningUser.value > newCardForCurrentUser.value ? winingUser : users[userIterator]
                } else {
                    winingUser = winingUser.cards[0].value < users[userIterator].cards[0].value ? users[userIterator] : winingUser;
                }
            } else {
                winingUser = users[userIterator];
            }
            console.log("triplet exists in user", userIterator)
        }
    }
    return winingUser;
}
function findSequence() {
    for (let userIterator = 0; userIterator < numberOfPlayers; userIterator++) {
        if ((users[userIterator].cards[2].value == users[userIterator].cards[1].value + 1) && (users[userIterator].cards[1].value == users[userIterator].cards[0].value + 1)) {
            users[userIterator].doesSequenceExists = true;
            if (winingUser) {
                if (winingUser.cards[0].value == users[userIterator].cards[0].value) {
                    // New card drawn for wining user 
                    let newCardForWiningUser = deck1.deal();
                    let newCardForCurrentUser = deck1.deal();
                    while (newCardForCurrentUser.value == newCardForWiningUser.value) {
                        newCardForWiningUser = deck1.deal();
                        newCardForCurrentUser = deck1.deal();
                    }
                    winingUser = newCardForWiningUser.value > newCardForCurrentUser.value ? winingUser : users[userIterator]
                } else {
                    winingUser = winingUser.cards[0].value < users[userIterator].cards[0].value ? users[userIterator] : winingUser;
                }
            } else {
                winingUser = users[userIterator];
            }
            console.log("sequence exists in user", userIterator)
        }
    }
    return winingUser;
}
function findAllThePairs() {

    for (let userIterator = 0; userIterator < numberOfPlayers; userIterator++) {
        if ((users[userIterator].cards[0].value == users[userIterator].cards[1].value) || (users[userIterator].cards[1].value == users[userIterator].cards[2].value)) {
            users[userIterator].doesPairExists = true;
            if (winingUser) {
                
                if (winingUser.cards[1].value == users[userIterator].cards[1].value) {
                    // New card drawn for wining user 
                    let newCardForWiningUser = deck1.deal();
                    let newCardForCurrentUser = deck1.deal();
                    while (newCardForCurrentUser.value == newCardForWiningUser.value) {
                        newCardForWiningUser = deck1.deal();
                        newCardForCurrentUser = deck1.deal();
                    }
                    winingUser = newCardForWiningUser.value > newCardForCurrentUser.value ? winingUser : users[userIterator]
                } else {
                    winingUser = winingUser.cards[1].value < users[userIterator].cards[1].value ? users[userIterator] : winingUser;
                }
            } else {
                winingUser = users[userIterator];
            }
            console.log("pair exists in user", userIterator)
        }
    }
    return winingUser;

}
// Basic Rules:
// - Use a standard deck of cards (no Joker).
// - Each player is dealt only three cards.
// - 'A' is considered to have a number value of 1.
// - 'A' is considered the top card in a face-off. So the order is A > K > Q > J > 10...2

// Victory:
// - A trail (three cards of the same number) is the highest possible combination.
// - The next highest is a sequence (numbers in order, e.g., 4,5,6. A is considered to have a value of 1).
// - The next highest is a pair of cards (e.g.: two Kings or two 10s).
// - If all else fails, the top card (by number value wins).
// - If the top card has the same value, each of the tied players draws a single card from the deck until a winner is found.
// - Only the newly drawn cards are compared to decide a tie. The top card wins a tie.
// - For now the suit (spades/hearts etc...), does not matter.
function declareTheWinner() {
    // console.log(user1.cards.filter((currentCard,cardIndex) =>{
    // if(currentCard.value == user1.cards[cardIndex+1].value){
    //     return currentCard;
    // }
    // }))
    // console.log(users)
    // // if triplet exists across two users, compare the first values .sort((currentUser,nextUser)=> currentUser.cards[0].value-nextUser.cards[0].value)
    // console.log('triplet',users.filter((eachUser)=>eachUser.doesTripletExist));
    // console.log('sequence',users.filter((eachUser)=>eachUser.doesSequenceExists));
    // console.log('pair',users.filter((eachUser)=>eachUser.doesPairExists));

    let returnedUser = findAllTheTriplets();
    console.log("returned user from triple user:", returnedUser)
    if (returnedUser) {
        return returnedUser;
    }
    returnedUser = findSequence();
    if (returnedUser) {
        return returnedUser;
    }
    returnedUser = findAllThePairs();
    if (returnedUser) {
        return returnedUser;
    }
    winingUser=users[0];
    for(let userIterator = 1; userIterator < numberOfPlayers; userIterator++){
        if (winingUser.cards[0].value == users[userIterator].cards[0].value) {
            // New card drawn for wining user 
            let newCardForWiningUser = deck1.deal();
            let newCardForCurrentUser = deck1.deal();
            while (newCardForCurrentUser.value == newCardForWiningUser.value) {
                newCardForWiningUser = deck1.deal();
                newCardForCurrentUser = deck1.deal();
            }
            winingUser = newCardForWiningUser.value > newCardForCurrentUser.value ? winingUser : users[userIterator]
        } else {
            winingUser = winingUser.cards[0].value < users[userIterator].cards[0].value ? users[userIterator] : winingUser;
        }
    }
    return winingUser;

}
// window.onload = load;

const deck1 = new Deck();

// Four users
for (let userIterator = 0; userIterator < numberOfPlayers; userIterator++) {
    users.push(new User());
}

console.log(startTheGame().cards);