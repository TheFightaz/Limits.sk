#=========================================#
#=====SK/PL WYKONANY PRZEZ THEFIGHTAZ=====#
#==========ZAKAZ KOPIOWANIA!==============#
#=========COPYRIGHT 2021©=================#
#=========================================#
#======https://github.com/TheFightaz======#
#=========================================#

#OPTIONS FOR VARIABLES
options:
	tag: &b｢&c&lCrafts&a&lMC&f&l.pl&b｣
	Hopper1: 35000
	Hopper2: 45000
	Hopper3: 65000
	Hopper4: 100000
#=======================================#
	Spawner1: 65000
	Spawner2: 95000
	Spawner3: 145000
	Spawner4: 210000
#=======================================#
	Gen1: 12500
	Gen2: 21000
	Gen3: 28000
	Gen4: 35000
	Gen5: 50000
	Gen6: 65000
	Gen7: 85000
	Gen8: 125000
#=======================================#
#VARIABLES
variables:
	{zmiennaHopper1::%player%} = "&cNie"
	{zmiennaHopper2::%player%} = "&cNie"
	{zmiennaHopper3::%player%} = "&cNie"
	{zmiennaHopper4::%player%} = "&cNie"
#=======================================#
	{zmiennaSpawner1::%player%} = "&cNie" 
	{zmiennaSpawner2::%player%} = "&cNie"
	{zmiennaSpawner3::%player%} = "&cNie"
	{zmiennaSpawner4::%player%} = "&cNie"
#=======================================#
	{zmiennaGen1::%player%} = "&cNie"
	{zmiennaGen2::%player%} = "&cNie"
	{zmiennaGen3::%player%} = "&cNie"
	{zmiennaGen4::%player%} = "&cNie"
	{zmiennaGen5::%player%} = "&cNie"
	{zmiennaGen6::%player%} = "&cNie"
	{zmiennaGen7::%player%} = "&cNie"
	{zmiennaGen8::%player%} = "&cNie"
#=======================================#
#COMMAND FOR GUI
command /limity:
	trigger:
		open chest inventory named "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMITY" with 3 rows to player
		wait 2 tick
		set slot 0,1,2,3,5,6,7,8,9,17,18,19,20,21,22,23,24,25,26 and 27 of player's current inventory to red stained glass pane named "" with lore "" #RED GLASS OUTSIDE GUI
		set slot 4 of player's current inventory to paper named "&aInformacje" with lore "&c» &ePotrzebujesz zwiększyć" and "&eswój limit?" and "&c» &eLub zwiększyć drop?" and "&c» &eWybierz opcje dla ciebie!" and "&c» &eI zakup większy limit" and "&elub większy drop!" #PAPER FOR BASIC INFORMATION
		set slot 10,12,13,14 and 16 of player's current inventory to lime stained glass pane named "" with lore "" #LIME GLASS INSIDE GUI
		set slot 11 of player's current inventory to hopper named "&cHopper" with lore "&c» &eZwiększ swój limit hopperów" and "&ena wyspie!" #HOPPER LIMIT
		set slot 15 of player's current inventory to spawner named "&3Spawner" with lore "&c» &eZwiększ swój limit spawnerów" and "&ena wyspie!" #SPAWNER LIMIT
		set slot 13 of player's current inventory to emerald ore named "&aGenerator" with lore "&c» &eZwiększ swój drop Generatorów" and "&ena wyspie!" #GENERATOR UPGRADE
		
#BLOCK GUI SLOTS (BASIC)
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMITY":
		cancel event
#BLOCK GUI SLOTS (HOPPER)
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &c&lHOPPERÓW":
		cancel event
#BLOCK GUI SLOTS (SPAWNER)
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &3&lSPAWNERÓW":
		cancel event
#BLOCK GUI SLOTS (GENERATOR)
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW":
		cancel event

#GUI FOR HOPPER
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMITY":
		clicked slot is 11:
			open chest inventory named "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &c&lHOPPERÓW" with 1 rows to player
			wait 2 tick
			set slot 0,2,4,6 and 8 of player's current inventory to red stained glass pane named "" with lore "" #RED GLASS INSIDE GUI#
			set slot 1 of player's current inventory to hopper named "&cHopper &eLimit &8(&a1&8)" with lore "&c» &eZwiększ swój limit" and "&ehopperów do &a60&e!" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaHopper1::%player%}%&8)" #HOPPER GUI UPGRADE LIMITS 1#
			set slot 3 of player's current inventory to hopper named "&cHopper &eLimit &8(&a2&8)" with lore "&c» &eZwiększ swój limit" and "&ehopperów do &a70&e!" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaHopper2::%player%}%&8)" #HOPPER GUI UPGRADE LIMITS 2#
			set slot 5 of player's current inventory to hopper named "&cHopper &eLimit &8(&a3&8)" with lore "&c» &eZwiększ swój limit" and "&ehopperów do &a80&e!" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaHopper3::%player%}%&8)" #HOPPER GUI UPGRADE LIMITS 3#
			set slot 7 of player's current inventory to hopper named "&cHopper &eLimit &8(&a4&8)" with lore "&c» &eZwiększ swój limit" and "&ehopperów do &a90&e!" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaHopper4::%player%}%&8)" #HOPPER GUI UPGRADE LIMITS 4#
#GUI FOR SPAWNER
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMITY":
		clicked slot is 15:
			open chest inventory named "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &3&lSPAWNERÓW" with 1 rows to player
			wait 2 tick
			set slot 0,2,4,6 and 8 of player's current inventory to red stained glass pane named "" with lore "" #RED GLASS INSIDE GUI#
			set slot 1 of player's current inventory to spawner named "&3Spawner &eLimit &8(&a1&8)" with lore "&c» &eZwiększ swój limit" and "&espawnerów do &a5&e!" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaSpawner1::%player%}%&8)" #SPAWNER GUI UPGRADE LIMITS 1#
			set slot 3 of player's current inventory to spawner named "&3Spawner &eLimit &8(&a2&8)" with lore "&c» &eZwiększ swój limit" and "&espawnerów do &a7&e!" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaSpawner2::%player%}%&8)" #SPAWNER GUI UPGRADE LIMITS 2#
			set slot 5 of player's current inventory to spawner named "&3Spawner &eLimit &8(&a3&8)" with lore "&c» &eZwiększ swój limit" and "&espawnerów do &a9&e!" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaSpawner3::%player%}%&8)" #SPAWNER GUI UPGRADE LIMITS 3#
			set slot 7 of player's current inventory to spawner named "&3Spawner &eLimit &8(&a4&8)" with lore "&c» &eZwiększ swój limit" and "&espawnerów do &a11&e!" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaSpawner4::%player%}%&8)" #SPAWNER GUI UPGRADE LIMITS 4#	
#GUI FOR GENERATOR
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMITY":
		clicked slot is 13:
			open chest inventory named "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW" with 2 rows to player
			wait 2 tick
			set slot 0,2,4,6,8,9,11,13,15 and 17 of player's current inventory to red stained glass pane named "" with lore "" #RED GLASS INSIDE GUI#
			set slot 1 of player's current inventory to coal ore named "&aGenerator &eUpgrade &8(&a1&8)" with lore "&c» &eZwiększ swój drop" and "&c» &a+ &4Redstone &8&l(&e5%%&8&l)" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaGen1::%player%}%&8)" #GENERATOR GUI UPGRADE LIMITS 1#
			set slot 3 of player's current inventory to iron ore named "&aGenerator &eUpgrade &8(&a2&8)" with lore "&c» &eZwiększ swój drop" and "&c» &a+ &1Lapis &8&l(&e5%%&8&l)" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaGen2::%player%}%&8)" #GENERATOR GUI UPGRADE LIMITS 2#
			set slot 5 of player's current inventory to gold ore named "&aGenerator &eUpgrade &8(&a3&8)" with lore "&c» &eZwiększ swój drop" and "&c» &a+ &bDiament &8&l(&e2%%&8&l)" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaGen3::%player%}%&8)" #GENERATOR GUI UPGRADE LIMITS 3#
			set slot 7 of player's current inventory to lapis lazuli ore named "&aGenerator &eUpgrade &8(&a4&8)" with lore "&c» &eZwiększ swój drop" and "&c» &a+ &bDiament &8&l(&e4%%&8&l)" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaGen4::%player%}%&8)" #GENERATOR GUI UPGRADE LIMITS 4#
			set slot 10 of player's current inventory to diamond ore named "&aGenerator &eUpgrade &8(&a5&8)" with lore "&c» &eZwiększ swój drop" and "&c» &a+ &bDiament &8&l(&e5%%&8&l)" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaGen5::%player%}%&8)" #GENERATOR GUI UPGRADE LIMITS 5#
			set slot 12 of player's current inventory to emerald ore named "&aGenerator &eUpgrade &8(&a6&8)" with lore "&c» &eZwiększ swój drop" and "&c» &a+ &2Emerald &8&l(&e1%%&8&l)" and "&c» &a+ &bDiament &8&l(&e6%%&8&l)" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaGen6::%player%}%&8)" #GENERATOR GUI UPGRADE LIMITS 6#
			set slot 14 of player's current inventory to diamond block named "&aGenerator &eUpgrade &8(&a7&8)" with lore "&c» &eZwiększ swój drop" and "&c» &a+ &2Emerald &8&l(&e3%%&8&l)" and "&c» &a+ &bDiament &8&l(&e7%%&8&l)" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaGen7::%player%}%&8)" #GENERATOR GUI UPGRADE LIMITS 7#
			set slot 16 of player's current inventory to netherite block named "&aGenerator &eUpgrade &8(&a8&8)" with lore "&c» &eZwiększ swój drop" and "&c» &a+ &6Netheryt &8&l(&e0.1%%&8&l)" and "&c» &a+ &2Emerald &8&l(&e7%%&8&l)" and "&c» &a+ &bDiament &8&l(&e10%%&8&l)" and "&c» &7Koszt: " and "&c» &7Posiadane: &8(%{zmiennaGen8::%player%}%&8)" #GENERATOR GUI UPGRADE LIMITS 8#			
			
#========================================================================HOPPERS LIMIT UPGRADE======================================================================================#
#FIRST UPGRADE LIMIT FOR HOPPERS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &c&lHOPPERÓW":
		clicked slot is 1:
			if {zmiennaHopper1::%player%} is "&cNie":
				if {zmiennaHopper2::%player%} is "&cNie":
					if {zmiennaHopper3::%player%} is "&cNie":
						if {zmiennaHopper4::%player%} is "&cNie":
							if player's balance is greater than or equal to {@Hopper1}:
								remove {@Hopper1} from player's balance
								set {zmiennaHopper1::%player%} to "&aTak"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.50"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.60"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.70"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.80"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.90"
								wait 2 tick
								execute console command "lp user %player% permission set fabledskyblock.limit.block.hopper.60"
								send "{@tag} &aPomyślnie zakupiłeś/aś większy limit &cHopperów!"
								close player's inventory
							else:
								send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Hopper1} &2$&8)"
								close player's inventory
						else:
							send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
							close player's inventory
					else:
						send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
						close player's inventory
				else:
					send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
					close player's inventory
			else:
				send "{@tag} &cPosiadasz już to ulepszenie limitu!"
				close player's inventory
#SECOND UPGRADE LIMIT FOR HOPPERS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &c&lHOPPERÓW":
		clicked slot is 3:
			if {zmiennaHopper2::%player%} is "&cNie":
				if {zmiennaHopper3::%player%} is "&cNie":
					if {zmiennaHopper4::%player%} is "&cNie":
						if player's balance is greater than or equal to {@Hopper2}:
							remove {@Hopper2} from player's balance
							set {zmiennaHopper2::%player%} to "&aTak"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.50"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.60"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.70"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.80"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.90"
							wait 2 tick
							execute console command "lp user %player% permission set fabledskyblock.limit.block.hopper.70"
							send "{@tag} &aPomyślnie zakupiłeś/aś większy limit &cHopperów!"
							close player's inventory
						else:
							send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Hopper2} &2$&8)"
							close player's inventory
					else:
						send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
						close player's inventory
				else:
					send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
					close player's inventory
			else:
				send "{@tag} &cPosiadasz już to ulepszenie limitu!"
				close player's inventory
#THIRD UPGRADE LIMIT FOR HOPPERS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &c&lHOPPERÓW":
		clicked slot is 5:
			if {zmiennaHopper3::%player%} is "&cNie":
				if {zmiennaHopper4::%player%} is "&cNie":
					if player's balance is greater than or equal to {@Hopper3}:
						remove {@Hopper3} from player's balance
						set {zmiennaHopper3::%player%} to "&aTak"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.50"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.60"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.70"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.80"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.90"
						wait 2 tick
						execute console command "lp user %player% permission set fabledskyblock.limit.block.hopper.80"
						send "{@tag} &aPomyślnie zakupiłeś/aś większy limit &cHopperów!"
						close player's inventory
					else:
						send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Hopper3} &2$&8)"
						close player's inventory
				else:
					send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
					close player's inventory
			else:
				send "{@tag} &cPosiadasz już to ulepszenie limitu!"
				close player's inventory
#FOURTH UPGRADE LIMIT FOR HOPPERS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &c&lHOPPERÓW":
		clicked slot is 7:
			if {zmiennaHopper4::%player%} is "&cNie":
				if player's balance is greater than or equal to {@Hopper4}:
					remove {@Hopper4} from player's balance
					set {zmiennaHopper4::%player%} to "&aTak"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.50"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.60"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.70"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.80"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.hopper.90"
					wait 2 tick
					execute console command "lp user %player% permission set fabledskyblock.limit.block.hopper.90"
					send "{@tag} &aPomyślnie zakupiłeś/aś większy limit &cHopperów!"
					close player's inventory
				else:
					send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Hopper4} &2$&8)"
					close player's inventory
			else:
				send "{@tag} &cPosiadasz już to ulepszenie limitu!"
				close player's inventory
#========================================================================SPAWNERS LIMIT UPGRADE======================================================================================#
#FIRST UPGRADE LIMIT FOR SPAWNERS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &3&lSPAWNERÓW":
		clicked slot is 1:
			if {zmiennaSpawner1::%player%} is "&cNie":
				if {zmiennaSpawner2::%player%} is "&cNie":
					if {zmiennaSpawner3::%player%} is "&cNie":
						if {zmiennaSpawner4::%player%} is "&cNie":
							if player's balance is greater than or equal to {@Spawner1}:
								remove {@Spawner1} from player's balance
								set {zmiennaSpawner1::%player%} to "&aTak"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.3"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.5"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.7"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.9"
								execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.11"
								wait 2 tick
								execute console command "lp user %player% permission set fabledskyblock.limit.block.spawner.5"
								send "{@tag} &aPomyślnie zakupiłeś/aś większy limit &eSpawnerów!"
								close player's inventory
							else:
								send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Spawner1} &2$&8)"
								close player's inventory
						else:
							send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
							close player's inventory
					else:
						send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
						close player's inventory
				else:
					send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
					close player's inventory
			else:
				send "{@tag} &cPosiadasz już to ulepszenie limitu!"
				close player's inventory
#SECOND UPGRADE LIMIT FOR SPAWNERS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &3&lSPAWNERÓW":
		clicked slot is 3:
			if {zmiennaSpawner2::%player%} is "&cNie":
				if {zmiennaSpawner3::%player%} is "&cNie":
					if {zmiennaSpawner4::%player%} is "&cNie":
						if player's balance is greater than or equal to {@Spawner2}:
							remove {@Spawner2} from player's balance
							set {zmiennaSpawner2::%player%} to "&aTak"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.3"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.5"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.7"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.9"
							execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.11"
							wait 2 tick
							execute console command "lp user %player% permission set fabledskyblock.limit.block.spawner.7"
							send "{@tag} &aPomyślnie zakupiłeś/aś większy limit &eSpawnerów!"
							close player's inventory
						else:
							send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Spawner2} &2$&8)"
							close player's inventory
					else:
						send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
						close player's inventory
				else:
					send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
					close player's inventory
			else:
				send "{@tag} &cPosiadasz już to ulepszenie limitu!"
				close player's inventory
#THIRD UPGRADE LIMIT FOR SPAWNERS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &3&lSPAWNERÓW":
		clicked slot is 5:
			if {zmiennaSpawner3::%player%} is "&cNie":
				if {zmiennaSpawner4::%player%} is "&cNie":
					if player's balance is greater than or equal to {@Spawner3}:
						remove {@Spawner3} from player's balance
						set {zmiennaSpawner3::%player%} to "&aTak"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.3"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.5"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.7"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.9"
						execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.11"
						wait 2 tick
						execute console command "lp user %player% permission set fabledskyblock.limit.block.spawner.9"
						send "{@tag} &aPomyślnie zakupiłeś/aś większy limit &eSpawnerów!"
						close player's inventory
					else:
						send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Spawner3} &2$&8)"
						close player's inventory
				else:
					send "{@tag} &cNie mozesz cofnąć się w ulepszeniu!"
					close player's inventory
			else:
				send "{@tag} &cPosiadasz już to ulepszenie limitu!"
				close player's inventory
#FOURTH UPGRADE LIMIT FOR SPAWNERS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lLIMIT &3&lSPAWNERÓW":
		clicked slot is 7:
			if {zmiennaSpawner4::%player%} is "&cNie":
				if player's balance is greater than or equal to {@Spawner4}:
					remove {@Spawner4} from player's balance
					set {zmiennaSpawner4::%player%} to "&aTak"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.3"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.5"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.7"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.9"
					execute console command "lp user %player% permission unset fabledskyblock.limit.block.spawner.11"
					wait 2 tick
					execute console command "lp user %player% permission set fabledskyblock.limit.block.spawner.11"
					send "{@tag} &aPomyślnie zakupiłeś/aś większy limit &eSpawnerów!"
					close player's inventory
				else:
					send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Spawner4} &2$&8)"
					close player's inventory
			else:
				send "{@tag} &cPosiadasz już to ulepszenie limitu!"
				close player's inventory
#========================================================================GENERATORS UPGRADE======================================================================================#
#FIRST UPGRADE FOR GENERATORS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW":
		clicked slot is 1:
			if {zmiennaGen1::%player%} is "&cNie":
				if player's balance is greater than or equal to {@Gen1}:
					remove {@Gen1} from player's balance
					set {zmiennaGen1::%player%} to "&aTak"
					execute console command "lp user %player% permission set fabledskyblock.generator.uplv2"
					send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie &2Generatora!"
					close player's inventory
				else:
					send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Gen1} &2$&8)"
					close player's inventory
			else:
				send "{@tag} &cPosiadasz już to ulepszenie!"
				close player's inventory
#SECOND UPGRADE FOR GENERATORS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW":
		clicked slot is 3:
			if {zmiennaGen1::%player%} is "&aTak":
				if {zmiennaGen2::%player%} is "&cNie":
					if player's balance is greater than or equal to {@Gen2}:
						remove {@Gen2} from player's balance
						set {zmiennaGen2::%player%} to "&aTak"
						execute console command "lp user %player% permission unset fabledskyblock.generator.uplv2"
						execute console command "lp user %player% permission set fabledskyblock.generator.uplv3"
						send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie &2Generatora!"
						close player's inventory
					else:
						send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Gen2} &2$&8)"
						close player's inventory
				else:
					send "{@tag} &cPosiadasz już to ulepszenie!"
					close player's inventory
			else:
				send "{@tag} &cZakup poprzednie ulepszenie!"
				close player's inventory
#THIRD UPGRADE FOR GENERATORS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW":
		clicked slot is 5:
			if {zmiennaGen1::%player%} is "&aTak":
				if {zmiennaGen2::%player%} is "&aTak":
					if {zmiennaGen3::%player%} is "&cNie":
						if player's balance is greater than or equal to {@Gen3}:
							remove {@Gen3} from player's balance
							set {zmiennaGen3::%player%} to "&aTak"
							execute console command "lp user %player% permission unset fabledskyblock.generator.uplv3"
							execute console command "lp user %player% permission set fabledskyblock.generator.uplv4"
							send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie &2Generatora!"
							close player's inventory
						else:
							send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Gen3} &2$&8)"
							close player's inventory
					else:
						send "{@tag} &cPosiadasz już to ulepszenie!"
						close player's inventory
				else:
					send "{@tag} &cZakup poprzednie ulepszenie!"
					close player's inventory
			else:
				send "{@tag} &cZakup poprzednie ulepszenie!"
				close player's inventory
#FOURTH UPGRADE FOR GENERATORS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW":
		clicked slot is 7:
			if {zmiennaGen1::%player%} is "&aTak":
				if {zmiennaGen2::%player%} is "&aTak":
					if {zmiennaGen3::%player%} is "&aTak":
						if {zmiennaGen4::%player%} is "&cNie":
							if player's balance is greater than or equal to {@Gen4}:
								remove {@Gen4} from player's balance
								set {zmiennaGen4::%player%} to "&aTak"
								execute console command "lp user %player% permission unset fabledskyblock.generator.uplv4"
								execute console command "lp user %player% permission set fabledskyblock.generator.uplv5"
								send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie &2Generatora!"
								close player's inventory
							else:
								send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Gen4} &2$&8)"
								close player's inventory
						else:
							send "{@tag} &cPosiadasz już to ulepszenie!"
							close player's inventory
					else:
						send "{@tag} &cZakup poprzednie ulepszenie!"
						close player's inventory
				else:
					send "{@tag} &cZakup poprzednie ulepszenie!"
					close player's inventory
			else:
				send "{@tag} &cZakup poprzednie ulepszenie!"
				close player's inventory
#FIFTH UPGRADE FOR GENERATORS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW":
		clicked slot is 10:
			if {zmiennaGen1::%player%} is "&aTak":
				if {zmiennaGen2::%player%} is "&aTak":
					if {zmiennaGen3::%player%} is "&aTak":
						if {zmiennaGen4::%player%} is "&aTak":
							if {zmiennaGen5::%player%} is "&cNie":
								if player's balance is greater than or equal to {@Gen5}:
									remove {@Gen5} from player's balance
									set {zmiennaGen5::%player%} to "&aTak"
									execute console command "lp user %player% permission unset fabledskyblock.generator.uplv5"
									execute console command "lp user %player% permission set fabledskyblock.generator.uplv6"
									send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie &2Generatora!"
									close player's inventory
								else:
									send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Gen4} &2$&8)"
									close player's inventory
							else:
								send "{@tag} &cPosiadasz już to ulepszenie!"
								close player's inventory
						else:
							send "{@tag} &cZakup poprzednie ulepszenie!"
							close player's inventory
					else:
						send "{@tag} &cZakup poprzednie ulepszenie!"
						close player's inventory
				else:
					send "{@tag} &cZakup poprzednie ulepszenie!"
					close player's inventory
			else:
				send "{@tag} &cZakup poprzednie ulepszenie!"
				close player's inventory
#SIXTH UPGRADE FOR GENERATORS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW":
		clicked slot is 12:
			if {zmiennaGen1::%player%} is "&aTak":
				if {zmiennaGen2::%player%} is "&aTak":
					if {zmiennaGen3::%player%} is "&aTak":
						if {zmiennaGen4::%player%} is "&aTak":
							if {zmiennaGen5::%player%} is "&aTak":
								if {zmiennaGen6::%player%} is "&cNie":
									if player's balance is greater than or equal to {@Gen6}:
										remove {@Gen6} from player's balance
										set {zmiennaGen6::%player%} to "&aTak"
										execute console command "lp user %player% permission unset fabledskyblock.generator.uplv6"
										execute console command "lp user %player% permission set fabledskyblock.generator.uplv7"
										send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie &2Generatora!"
										close player's inventory
									else:
										send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Gen6} &2$&8)"
										close player's inventory
								else:
									send "{@tag} &cPosiadasz już to ulepszenie!"
									close player's inventory
							else:
								send "{@tag} &cZakup poprzednie ulepszenie!"
								close player's inventory
						else:
							send "{@tag} &cZakup poprzednie ulepszenie!"
							close player's inventory
					else:
						send "{@tag} &cZakup poprzednie ulepszenie!"
						close player's inventory
				else:
					send "{@tag} &cZakup poprzednie ulepszenie!"
					close player's inventory
			else:
				send "{@tag} &cZakup poprzednie ulepszenie!"
				close player's inventory
#SEVENTH UPGRADE FOR GENERATORS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW":
		clicked slot is 14:
			if {zmiennaGen1::%player%} is "&aTak":
				if {zmiennaGen2::%player%} is "&aTak":
					if {zmiennaGen3::%player%} is "&aTak":
						if {zmiennaGen4::%player%} is "&aTak":
							if {zmiennaGen5::%player%} is "&aTak":
								if {zmiennaGen6::%player%} is "&aTak":
									if {zmiennaGen7::%player%} is "&cNie":
										if player's balance is greater than or equal to {@Gen7}:
											remove {@Gen7} from player's balance
											set {zmiennaGen7::%player%} to "&aTak"
											execute console command "lp user %player% permission unset fabledskyblock.generator.uplv7"
											execute console command "lp user %player% permission set fabledskyblock.generator.uplv9"
											send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie &2Generatora!"
											close player's inventory
										else:
											send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Gen7} &2$&8)"
											close player's inventory
									else:
										send "{@tag} &cPosiadasz już to ulepszenie!"
										close player's inventory
								else:
									send "{@tag} &cZakup poprzednie ulepszenie"
									close player's inventory
							else:
								send "{@tag} &cZakup poprzednie ulepszenie!"
								close player's inventory
						else:
							send "{@tag} &cZakup poprzednie ulepszenie!"
							close player's inventory
					else:
						send "{@tag} &cZakup poprzednie ulepszenie!"
						close player's inventory
				else:
					send "{@tag} &cZakup poprzednie ulepszenie!"
					close player's inventory
			else:
				send "{@tag} &cZakup poprzednie ulepszenie!"
				close player's inventory
#EIGHTH UPGRADE FOR GENERATORS
on inventory click:
	name of player's current inventory is "&c&lCrafts&a&lMC&f&l.pl &8| &6&lUPGRADE &a&lGENERATORÓW":
		clicked slot is 16:
			if {zmiennaGen1::%player%} is "&aTak":
				if {zmiennaGen2::%player%} is "&aTak":
					if {zmiennaGen3::%player%} is "&aTak":
						if {zmiennaGen4::%player%} is "&aTak":
							if {zmiennaGen5::%player%} is "&aTak":
								if {zmiennaGen6::%player%} is "&aTak":
									if {zmiennaGen7::%player%} is "&aTak":
										if {zmiennaGen8::%player%} is "&cNie":
											if player's balance is greater than or equal to {@Gen8}:
												remove {@Gen8} from player's balance
												set {zmiennaGen8::%player%} to "&aTak"
												execute console command "lp user %player% permission unset fabledskyblock.generator.uplv9"
												execute console command "lp user %player% permission set fabledskyblock.generator.uplv9"
												send "{@tag} &aPomyślnie zakupiłeś/aś ulepszenie &2Generatora!"
												close player's inventory
											else:
												send "{@tag} &cNie posiadasz wystarczająco gotówki &8(&e{@Gen8} &2$&8)"
												close player's inventory
										else:
											send "{@tag} &cPosiadasz już to ulepszenie!"
											close player's inventory
									else:
										send "{@tag} &cZakup poprzednie ulepszenie!"
										close player's inventory
								else:
									send "{@tag} &cZakup poprzednie ulepszenie"
									close player's inventory
							else:
								send "{@tag} &cZakup poprzednie ulepszenie!"
								close player's inventory
						else:
							send "{@tag} &cZakup poprzednie ulepszenie!"
							close player's inventory
					else:
						send "{@tag} &cZakup poprzednie ulepszenie!"
						close player's inventory
				else:
					send "{@tag} &cZakup poprzednie ulepszenie!"
					close player's inventory
			else:
				send "{@tag} &cZakup poprzednie ulepszenie!"
				close player's inventory
