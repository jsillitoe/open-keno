open-keno
=========

Version 0.1.0

Introduction
------------
Open-keno is an extensible library for playing various styles of Keno.  It provides a default reference
implementation, but can be extended to support network play, custom paytables, and ball providers.

Contents
--------

### Standard Keno
Keno is a simple game of luck where the player chooses numbers and hope as many as possible match those randomly drawn 

#### Rules

1. The player makes a wager and indicates which numbers he wishes to pick. The picks are made on a slip of paper in live keno and by touching the screen in video keno. The range of numbers the player may pick from is 1 to 80.
2. The number of picks the player may make depends on the game itself. Usually the range is 2 to 10 or 1 to 15.
3. The game will randomly choose 20 out of 80 balls.
4. If the game chooses a number the player chose that is known as a "catch." The player is paid according to the number of balls he catchs.

### Power Keno

The rules in Power Keno are the same as standard keno, except if the player catches the 20th ball drawn, then any winnings are quadrupled.

### Super Keno

The rules in Super Keno the same as standard keno, except if the player catches the 1st ball drawn, then any winnings are quadrupled.

### Top-Bottom Keno

Top-bottom keno pays according to how many balls fall into a half (top or bottom) chosen by the player.


Usage
-----

### Basic Usage

For the standard keno game, instantiate the StandardKeno class and any tickets to play:

    Keno keno = new StandardKeno();
    Ticket ticket = new DefaultTicket();
    ticket.markNumber(25);
    RaceResult result = keno.playTicket(ticket);


Current Status
--------------
- *Standard Keno* - Complete
- *Power Keno* - Complete
- *Super Keno* - In progress
- *Top-Bottom Keno* - Planning
