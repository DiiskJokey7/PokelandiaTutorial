package br.com.diiskjokey.diiskpl;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import mkremins.fanciful.FancyMessage;

public class Moveset implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (!(sender instanceof Player))
			return true;
		Player p = (Player) sender;
		if (args.length > 0) {
			if (args[0].equalsIgnoreCase("a")) {
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra A " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bAbsol").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSuper Luck \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fSucker Punch \n§9Move2: §fPsycho Cut \n§9Move3: §fSwords Dance \n§9Move4: §fAerial Ace \n§2Held Item: §fLife Orb")
						.then("§7 • §4Azelf")
						.tooltip(
								"§4Nature: §fJolly \n§5Ability: §fLevitate \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fStealth Rock \n§9Move2: §fExplosion \n§9Move3: §fTaunt \n§9Move4: §fFire Blast \n§2Held Item: §fFocus Sash")
						.send(p);
				new FancyMessage("§7• §bAerodactyl").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fPressure \n§6EVS: §f175ATK / 80SPATK / 255SPEED \n§9Move1: §fStealth Rock \n§9Move2: §fTaunt \n§9Move3: §fStone Edge \n§9Move4: §fFire Blast \n§2Held Item: §fFocus Sash")
						.send(p);
				new FancyMessage("§7• §bAggron").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fRock Head \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fHeavy Slam \n§9Move2: §fEarthquake \n§9Move3: §fIce Punch \n§9Move4: §fFire Punch \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bAipom").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fSkill Link \n§6EVS: §f75HP / 115ATK / 75DEF / 245SPEED \n§9Move1: §fFury Swipes \n§9Move2: §fKnock Off \n§9Move3: §fBrick Break \n§9Move4: §fFake Out \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bAlakazam").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fMagic Guard \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fPsychic \n§9Move2: §fShadow Ball \n§9Move3: §fCalm Mind \n§9Move4: §fFocus Blast \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bAltaria").tooltip(
						"§4Nature: §fModest \n§5Ability: §fNatural Cure \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fDraco Meteor \n§9Move2: §fFire Blast \n§9Move3: §fEarthquake \n§9Move4: §fToxic \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bAmpharos").tooltip(
						"§4Nature: §fModest \n§5Ability: §fStatic \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fThunderbolt \n§9Move2: §fVolt Switch \n§9Move3: §fDragon Pulse \n§9Move4: §fFocus Blast \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bArbok").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fIntimidate \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fCoil \n§9Move2: §fGunk Shot \n§9Move3: §fEarthquake \n§9Move4: §fSucker Punch \n§2Held Item: §fBlack Sludge")
						.send(p);
				new FancyMessage("§7• §bArcanine").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fIntimidate \n§6EVS: §f255HP / 255DEF \n§9Move1: §fExtreme Speed \n§9Move2: §fMorning Sun \n§9Move3: §fToxic \n§9Move4: §fFlare Blitz \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bArcheops").tooltip(
						"§4Nature: §fHasty \n§5Ability: §fDefeatist \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fAcrobatics \n§9Move2: §fStone Edge \n§9Move3: §fTaunt \n§9Move4: §fEarthquake \n§2Held Item: §fFocus Sash")
						.send(p);
				new FancyMessage("§7• §bAriados").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fInsomnia \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fSticky Web \n§9Move2: §fToxic Spikes \n§9Move3: §fMegahorn \n§9Move4: §fSucker Punch \n§2Held Item: §fFocus Sash")
						.send(p);
				new FancyMessage("§7• §bArmaldo").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSwift Swim \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fSwords Dance \n§9Move2: §fStone Edge \n§9Move3: §fEarthquake \n§9Move4: §fX-Scissor \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bArticuno").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fPressure \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fSubstitute \n§9Move2: §fHurricane \n§9Move3: §fIce Beam \n§9Move4: §fAgility \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bAzumarill").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fHuge Power \n§6EVS: §f255HP / 255SATK \n§9Move1: §fWaterfall \n§9Move2: §fBelly Drum \n§9Move3: §fAqua Jet \n§9Move4: §fSuperpower \n§2Held Item: §fChoice Band")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("b")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra B " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bBastiodon").tooltip(
						"§4Nature: §fCareful \n§5Ability: §fSturdy \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fStealth Rock \n§9Move2: §fToxic \n§9Move3: §fIron Head \n§9Move4: §fRoar \n§2Held Item: §fLeftovers")
				.then("§7 • §4Beartic")
				.tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSlush Rush \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fIcicle Crash \n§9Move2: §fSuperpower \n§9Move3: §fStone Edge \n§9Move4: §fSwords Dance \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bBeedrill").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fSwarm \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fU-Turn \n§9Move2: §fProtect \n§9Move3: §fPoison Jab \n§9Move4: §fToxic Spikes \n§2Held Item: §fFocus Sash")
				.then("§7 • §4Breloom")
				.tooltip(
						"§4Nature: §fJolly \n§5Ability: §fTechnician \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fSpore \n§9Move2: §fBullet Seed \n§9Move3: §fMach Punch \n§9Move4: §fSwords Dance \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bBellossom").tooltip(
						"§4Nature: §fModest \n§5Ability: §fChlorophyll \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fSolar Beam \n§9Move2: §fSleep Powder \n§9Move3: §fGiga Drain \n§9Move4: §fLeaf Storm \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bBisharp").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fDefiant \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fSwords Dance \n§9Move2: §fIron Head \n§9Move3: §fSucker Punch \n§9Move4: §fNight Slash \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bBlastoise").tooltip(
						"§4Nature: §fModest \n§5Ability: §fRain Dish \n§6EVS: §f255SPATK / 255HP \n§9Move1: §fRapid Spin \n§9Move2: §fHydro Pump \n§9Move3: §fDark Pulse \n§9Move4: §fIce Beam \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bBlaziken").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSpeed Boost \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fStone Edge \n§9Move2: §fFlare Blitz \n§9Move3: §fLow Kick \n§9Move4: §fProtect \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bBlissey").tooltip(
						"§4Nature: §fBold \n§5Ability: §fNatural Cure \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fThunder Wave \n§9Move2: §fToxic \n§9Move3: §fSoft-Boiled \n§9Move4: §fSeismic Toss \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bBraviary").tooltip(
						"§4Nature: §fCareful \n§5Ability: §fDefiant \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fSubstitute \n§9Move2: §fBulk Up \n§9Move3: §fBrave Bird \n§9Move4: §fU-Turn \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bButterfree").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fTinted Lens \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fSleep Powder \n§9Move2: §fQuiver Dance \n§9Move3: §fBug Buzz \n§9Move4: §fEnergy Ball \n§2Held Item: §fLife Orb")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("c")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra C " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bCamerupt").tooltip(
						"§4Nature: §fQuiet \n§5Ability: §fSolid Rock \n§6EVS: §f255HP / 255SPATK \n§9Move1: §fEruption \n§9Move2: §fFire Blast \n§9Move3: §fEarth Power \n§9Move4: §fYawn \n§2Held Item: §fChoice Specs")
				.then("§7 • §4Cacturne")
				.tooltip(
						"§4Nature: §fRash \n§5Ability: §fWater Absorb \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fEnergy Ball \n§9Move2: §fDark Pulse \n§9Move3: §fFocus Blast \n§9Move4: §fSucker Punch \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bCarracosta").tooltip(
						"§4Nature: §fRelaxed \n§5Ability: §fSolid Rock \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fStealth Rock \n§9Move2: §fScald \n§9Move3: §fRock Slide \n§9Move4: §fKnock Off \n§2Held Item: §fLeftovers")
				.then("§7 • §4Cresselia")
				.tooltip(
						"§4Nature: §fBold \n§5Ability: §fLevitate \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fCalm Mind \n§9Move2: §fPsyshock \n§9Move3: §fIce Beam \n§9Move4: §fSubstitute \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bCelebi").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fNatural Cure \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fGiga Drain \n§9Move2: §fPsychic \n§9Move3: §fLeech Seed \n§9Move4: §fU-Turn \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bChandelure").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fFlash Fire \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fFire Blast \n§9Move2: §fShadow Ball \n§9Move3: §fEnergy Ball \n§9Move4: §fMemento \n§2Held Item: §fChoice Scarf")
						.send(p);
				new FancyMessage("§7• §bChansey").tooltip(
						"§4Nature: §fBold \n§5Ability: §fNatural Cure \n§6EVS: §f255DEF / 255SPDEF \n§9Move1: §fToxic \n§9Move2: §fSoft-Boiled \n§9Move3: §fSeismic Toss \n§9Move4: §fStealth Rock \n§2Held Item: §fEviolite")
						.send(p);
				new FancyMessage("§7• §bCharizard").tooltip(
						"§4Nature: §fJolly \n§5Ab	ility: §fBlaze \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fFlare Blitz \n§9Move2: §fDragon Claw \n§9Move3: §fEarthquake \n§9Move4: §fDragon Dance \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bChatot").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fTangled Feet \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fU-Turn \n§9Move2: §fNasty Plot \n§9Move3: §fSubstitute \n§9Move4: §fChatter \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bClefable").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fMagic Guard \n§6EVS: §f255HP / 255DEF \n§9Move1: §fCalm Mind \n§9Move2: §fSoft-Boiled \n§9Move3: §fThunder Wave \n§9Move4: §fPsychic \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bCloyster").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fSkill Link \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fShell Smash \n§9Move2: §fIcicle Spear \n§9Move3: §fExplosion \n§9Move4: §fIce Shard \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bCorsola").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fRegenerator \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fStealth Rock \n§9Move2: §fRecover \n§9Move3: §fScald \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bCottonne").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fPrankster \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fGiga Drain \n§9Move2: §fEncore \n§9Move3: §fStun Spore \n§9Move4: §fLeech Seed \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bCrawdaunt").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fAdaptability \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fSwords Dance \n§9Move2: §fCrabhammer \n§9Move3: §fKnock Off \n§9Move4: §fAqua Jet \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bCrobat").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fInfiltrator \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fAcrobatics \n§9Move2: §fToxic \n§9Move3: §fTaunt \n§9Move4: §fU-Turn \n§2Held Item: §fBlack Sludge")
						.send(p);
				new FancyMessage("§7• §bCrustle").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fSturdy \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fStealth Rock \n§9Move2: §fSpikes \n§9Move3: §fStone Edge \n§9Move4: §fEarthquake \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bCryogonal").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fLevitate \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fRapid Spin \n§9Move2: §fFreeze-Dry \n§9Move3: §fIce Beam \n§9Move4: §fRecover \n§2Held Item: §fNever-Melt Ice")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				return true;
			}
			if (args[0].equalsIgnoreCase("d")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra D " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bDelibird").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fVital Spirit \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fRapid Spin \n§9Move2: §fIcy Wind \n§9Move3: §fFreeze-Dry \n§9Move4: §fDestiny Bond \n§2Held Item: §fFocus Sash")
				.then("§7 • §4Darkrai")
				.tooltip(
						"§4Nature: §fTimid \n§5Ability: §fBad Dreams \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fDark Void \n§9Move2: §fDark Pulse \n§9Move3: §fNasty Plot \n§9Move4: §fThunder \n§2Held Item: §fFocus Sash")
				.send(p);
				new FancyMessage("§7• §bDewgong").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fThick Fat \n§6EVS: §f255SPDEF / 255HP \n§9Move1: §fToxic \n§9Move2: §fProtect \n§9Move3: §fSurf \n§9Move4: §fIce Beam \n§2Held Item: §fLeftovers")
				.then("§7 • §4Dialga")
				.tooltip(
						"§4Nature: §fModest \n§5Ability: §fPressure \n§6EVS: §f255SPATK / 255HP \n§9Move1: §fStealth Rock \n§9Move2: §fDraco Meteor \n§9Move3: §fFire Blast \n§9Move4: §fToxic \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bDitto").tooltip(
						"§4Nature: §fRelaxed \n§5Ability: §fImposter \n§6EVS: §f255DEF / 255HP \n§9Move1: §fTransform \n§2Held Item: §fChoice Scarf")
						.send(p);
				new FancyMessage("§7• §bDodrio").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fEarly Bird \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fBrave Bird \n§9Move2: §fReturn \n§9Move3: §fPursuit \n§9Move4: §fQuick Attack \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bDonphan").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fSturdy \n§6EVS: §f255HP / 255DEF \n§9Move1: §fEarthquake \n§9Move2: §fRapid Spin \n§9Move3: §fStealth Rock \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bDragonite").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fMultiscale \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fDragon Dance \n§9Move2: §fOutrage \n§9Move3: §fExtreme Speed \n§9Move4: §fEarthquake \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bDrapion").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSniper \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fKnock Off \n§9Move2: §fPoison Jab \n§9Move3: §fPursuit \n§9Move4: §fIce Fang \n§2Held Item: §fChoice Scarf")
						.send(p);
				new FancyMessage("§7• §bDrifblim").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fUnburden \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fAcrobatics \n§9Move2: §fSubstitute \n§9Move3: §fWill-O-Wisp \n§9Move4: §fDestiny Bond \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bDugtrio").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fArena Trap \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fEarthquake \n§9Move2: §fToxic \n§9Move3: §fMemento \n§9Move4: §fStealth Rock \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bDunsparce").tooltip(
						"§4Nature: §fCareful \n§5Ability: §fSerene Grace \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fStealth Rock \n§9Move2: §fBody Slam \n§9Move3: §fGlare \n§9Move4: §fHeadbutt \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("e")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra E " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bElectivire").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fMotor Drive \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fThunder Punch \n§9Move2: §fIce Punch \n§9Move3: §fFire Punch \n§9Move4: §fEarthquake \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bElectrode").tooltip(
						"§4Nature: §fModest \n§5Ability: §fSoundproof \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fThunderbolt \n§9Move2: §fVolt Switch \n§9Move3: §fTaunt \n§9Move4: §fExplosion \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bEmboar").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fReckless \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fFlare Blitz \n§9Move2: §fWild Charge \n§9Move3: §fSucker Punch \n§9Move4: §fSleep Talk \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bEmolga").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fMotor Drive \n§6EVS: §f255SPEED / 255HP \n§9Move1: §fTaunt \n§9Move2: §fU-Turn \n§9Move3: §fEncore \n§9Move4: §fThunderbolt \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bEmpoleon").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fTorrent \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fScald \n§9Move2: §fDefog \n§9Move3: §fToxic \n§9Move4: §fRoar \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bEntei").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fPressure \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fSacred Fire \n§9Move2: §fStone Edge \n§9Move3: §fBulldoze \n§9Move4: §fSleep Talk \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bEspeon").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fMagic Bounce \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fPsychic \n§9Move2: §fShadow Ball \n§9Move3: §fGrass Knot \n§9Move4: §fCalm Mind \n§2Held Item: §fChoice Specs")
						.send(p);
				new FancyMessage("§7• §bExeggutor").tooltip(
						"§4Nature: §fModest \n§5Ability: §fChlorophyll \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fSolar Beam \n§9Move2: §fPsyshock \n§9Move3: §fSleep Powder \n§9Move4: §fSunny Day \n§2Held Item: §fLife Orb")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("f")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra F " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bFarfetch'd").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fDefiant \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fSwords Dance \n§9Move2: §fBrave Bird \n§9Move3: §fLeaf Blade \n§9Move4: §fKnock Off \n§2Held Item: §fStick")
						.send(p);
				new FancyMessage("§7• §bFearow").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fKeen Eye \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fDrill Peck \n§9Move2: §fDouble-Edge \n§9Move3: §fDrill Run \n§9Move4: §fU-Turn \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bFeraligatr").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSheer Force \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fDragon Dance \n§9Move2: §fWaterfall \n§9Move3: §fCrunch \n§9Move4: §fIce Punch \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bFlareon").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fFlash Fire \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fFlare Blitz \n§9Move2: §fBaton Pass \n§9Move3: §fQuick Attack \n§9Move4: §fDouble-Edge \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bFlygon").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fLevitate \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fEarthquake \n§9Move2: §fU-Turn \n§9Move3: §fDragon Claw \n§9Move4: §fDefog \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bForretress").tooltip(
						"§4Nature: §fRelaxed \n§5Ability: §fSturdy \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fRapid Spin \n§9Move2: §fStealth Rock \n§9Move3: §fVolt Switch \n§9Move4: §fGyro Ball \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("g")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra G " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bGalvantula").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fCoumpound Eyes \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fBug Buzz \n§9Move2: §fSticky Web \n§9Move3: §fThunder \n§9Move4: §fEnergy Ball \n§2Held Item: §fLife Orb")
				.then("§7 • §4Gallade")
				.tooltip(
						"§4Nature: §fJolly \n§5Ability: §fJustified \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fSwords Dance \n§9Move2: §fClose Combat \n§9Move3: §fNight Slash \n§9Move4: §fLeaf Blade \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bGengar").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fLevitate \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fShadow Ball \n§9Move2: §fSludge Bomb \n§9Move3: §fThunderbolt \n§9Move4: §fHypnosis \n§2Held Item: §fBlack Sludge")
				.then("§7 • §4Gardevoir")
				.tooltip(
						"§4Nature: §fTimid \n§5Ability: §fTrace \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fPsyshock \n§9Move2: §fFocus Blast \n§9Move3: §fCalm Mind \n§9Move4: §fMagical Leaf \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bGigalith").tooltip(
						"§4Nature: §fCareful \n§5Ability: §fSand Stream \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fStealth Rock \n§9Move2: §fStone Edge \n§9Move3: §fEarthquake \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
				.then("§7 • §4Giratina")
				.tooltip(
						"§4Nature: §fBold \n§5Ability: §fPressure \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fToxic \n§9Move2: §fDragon Tail \n§9Move3: §fSleep Talk \n§9Move4: §fRest \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bGirafarig").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fSap Sipper \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fNasty Plot \n§9Move2: §fBaton Pass \n§9Move3: §fPsychic \n§9Move4: §fSubstitute \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bGlaceon").tooltip(
						"§4Nature: §fModest \n§5Ability: §fIce Body \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fIce Beam \n§9Move2: §fShadow Ball \n§9Move3: §fBaton Pass \n§9Move4: §fFrost Breath \n§2Held Item: §fChoice Specs")
						.send(p);
				new FancyMessage("§7• §bGliscor").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fPoison Heal \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fSwords Dance \n§9Move2: §fEarthquake \n§9Move3: §fFacade \n§9Move4: §fToxic \n§2Held Item: §fToxic Orb")
						.send(p);
				new FancyMessage("§7• §bGroudon").tooltip(
						"§4Nature: §fCareful \n§5Ability: §fDrought \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fStealth Rock \n§9Move2: §fPrecipice Blades \n§9Move3: §fRoar \n§9Move4: §fLava Plume \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bGolduck").tooltip(
						"§4Nature: §fModest \n§5Ability: §fSwift Swim \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fRain Dance \n§9Move2: §fHydro Pump \n§9Move3: §fIce Beam \n§9Move4: §fPsyshock \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bGolem").tooltip(
						"§4Nature: §fCareful \n§5Ability: §fSturdy \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fStealth Rock \n§9Move2: §fStone Edge \n§9Move3: §fEarthquake \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bGolurk").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fIron Fist \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fIce Punch \n§9Move2: §fShadow Punch \n§9Move3: §fEarthquake \n§9Move4: §fThunder Punch \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bGyarados").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fIntimidate \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fDragon Dance \n§9Move2: §fWaterfall \n§9Move3: §fEarthquake \n§9Move4: §fSubstitute \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("h")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra H " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bHitmonchan").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fIron Fist \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fDrain Punch \n§9Move2: §fMach Punch \n§9Move3: §fIce Punch \n§9Move4: §fStone Edge \n§2Held Item: §fLife Orb")
				.then("§7 • §4Heatran")
				.tooltip(
						"§4Nature: §fTimid \n§5Ability: §fFlash Fire \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fMagma Storm \n§9Move2: §fEarth Power \n§9Move3: §fTaunt \n§9Move4: §fStealth Rock \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bHitmonlee").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fReckless \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fHigh Jump Kick \n§9Move2: §fMach Punch \n§9Move3: §fSucker Punch \n§9Move4: §fRapid Spin \n§2Held Item: §fLife Orb")
				.then("§7 • §4Heracross")
				.tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fMoxie \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fSubstitute \n§9Move2: §fClose Combat \n§9Move3: §fPin Missile \n§9Move4: §fRock Blast \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bHitmontop").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fIntimidate \n§6EVS: §f255SPDEF / 255HP \n§9Move1: §fRapid Spin \n§9Move2: §fClose Combat \n§9Move3: §fForesight \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bHonchkrow").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fMoxie \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fBrave Bird \n§9Move2: §fSucker Punch \n§9Move3: §fPursuit \n§9Move4: §fSteel Wing \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bHoundoom").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fFlash Fire \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fNasty Plot \n§9Move2: §fFire Blast \n§9Move3: §fDark Pulse \n§9Move4: §fToxic \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bHypno").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fInsomnia \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fNasty Plot \n§9Move2: §fSubstitute \n§9Move3: §fPsychic \n§9Move4: §fShadow Ball \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("i")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra I " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bInfernape").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fIron Fist \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fClose Combat \n§9Move2: §fFlare Blitz \n§9Move3: §fU-Turn \n§9Move4: §fEarthquake \n§2Held Item: §fChoice Band")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("j")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra J " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bJolteon").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fVolt Absorb \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fThunderbolt \n§9Move2: §fVolt Switch \n§9Move3: §fSubstitute \n§9Move4: §fBaton Pass \n§2Held Item: §fLeftovers")
				.then("§7 • §4Jirachi")
				.tooltip(
						"§4Nature: §fCareful \n§5Ability: §fSerene Grace \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fIron Head \n§9Move2: §fStealth Rock \n§9Move3: §fU-Turn \n§9Move4: §fHealing Wish \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bJynx").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fDry Skin \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fIce Beam \n§9Move2: §fLovely Kiss \n§9Move3: §fPsyshock \n§9Move4: §fFocus Blast \n§2Held Item: §fFocus Sash")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("k")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra K " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bKabutops").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fSwift Swim \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fSwords Dance \n§9Move2: §fStone Edge \n§9Move3: §fAqua Jet \n§9Move4: §fWaterfall \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bKangaskahn").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fScrappy \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fFake Out \n§9Move2: §fDouble-Edge \n§9Move3: §fSucker Punch \n§9Move4: §fEarthquake \n§2Held Item: §fSilk Scarf")
						.send(p);
				new FancyMessage("§7• §bKingdra").tooltip(
						"§4Nature: §fModest \n§5Ability: §fSwift Swim \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fHydro Pump \n§9Move2: §fScald \n§9Move3: §fIce Beam \n§9Move4: §fDragon Pulse \n§2Held Item: §fChoice Specs")
						.send(p);
				new FancyMessage("§7• §bKingler").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fHyper Cutter \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fCrabhammer \n§9Move2: §fSwords Dance \n§9Move3: §fAgility \n§9Move4: §fMetal Claw \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bKlinklang").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fClear Body \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fShift Gear \n§9Move2: §fGear Grind \n§9Move3: §fReturn \n§9Move4: §fSubstitute \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bKrookodile").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fIntimidate \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fEarthquake \n§9Move2: §fStone Edge \n§9Move3: §fPursuit \n§9Move4: §fBrick Break \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bKyogre").tooltip(
						"§4Nature: §fBold \n§5Ability: §fDrizzle \n§6EVS: §f255HP / 255DEF \n§9Move1: §fRest \n§9Move2: §fSleep Talk \n§9Move3: §fScald \n§9Move4: §fIce Beam \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("l")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra L " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bLanturn").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fVolt Absorb \n§6EVS: §f255DEF / 255SPDEF \n§9Move1: §fScald \n§9Move2: §fVolt Switch \n§9Move3: §fToxic \n§9Move4: §fProtect \n§2Held Item: §fLeftovers")
				.then("§7 • §4Latias")
				.tooltip(
						"§4Nature: §fTimid \n§5Ability: §fLevitate \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fCalm Mind \n§9Move2: §fDragon Pulse \n§9Move3: §fPsychic \n§9Move4: §fRecover \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bLapras").tooltip(
						"§4Nature: §fModest \n§5Ability: §fWater Absorb \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fFreeze-Dry \n§9Move2: §fIce Beam \n§9Move3: §fHydro Pump \n§9Move4: §fSurf \n§2Held Item: §fChoice Specs")
				.then("§7 • §4Latios")
				.tooltip(
						"§4Nature: §fTimid \n§5Ability: §fLevitate \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fDefog \n§9Move2: §fDragon Pulse \n§9Move3: §fPsyshock \n§9Move4: §fThunder Wave \n§2Held Item: §fChoice Scarf")
				.send(p);
				new FancyMessage("§7• §bLeafeon").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fChlorophyll \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fSwords Dance \n§9Move2: §fLeaf Blade \n§9Move3: §fShadow Ball \n§9Move4: §fReturn \n§2Held Item: §fChoice Scarf")
						.send(p);
				new FancyMessage("§7• §bLeavanny").tooltip(
						"§4Nature: §fNaive \n§5Ability: §fChlorophyll \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fSticky Web \n§9Move2: §fLeaf Storm \n§9Move3: §fBug Buzz \n§9Move4: §fDream Eater \n§2Held Item: §fFocus Sash")
						.send(p);
				new FancyMessage("§7• §bLedian").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fEarly Bird \n§6EVS: §f255SPEED / 255HP \n§9Move1: §fReflect \n§9Move2: §fLight Screen \n§9Move3: §fEncore \n§9Move4: §fU-Turn \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bLickitung").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fOblivious \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fProtect \n§9Move2: §fBody Slam \n§9Move3: §fKnock Off \n§9Move4: §fPower Whip \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bLucario").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fJustified \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fSwords Dance \n§9Move2: §fClose Combat \n§9Move3: §fExtreme Speed \n§9Move4: §fIce Punch \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bLugia").tooltip(
						"§4Nature: §fBold \n§5Ability: §fMultiscale \n§6EVS: §f255HP / 255DEF \n§9Move1: §fToxic \n§9Move2: §fWhirlwind \n§9Move3: §fSubstitute \n§9Move4: §fIce Beam \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bLunatone").tooltip(
						"§4Nature: §fModest \n§5Ability: §fLevitate \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fRock Polish \n§9Move2: §fPsychic \n§9Move3: §fIce Beam \n§9Move4: §fShadow Ball \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bLuxray").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fIntimidate \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fWild Charge \n§9Move2: §fIce Fang \n§9Move3: §fVolt Switch \n§9Move4: §fCrunch \n§2Held Item: §fChoice Band")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("m")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra M " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bMachamp").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fNo Guard \n§6EVS: §f255HP / 255ATK \n§9Move1: §fDynamic Punch \n§9Move2: §fKnock Off \n§9Move3: §fBullet Punch \n§9Move4: §fStone Edge \n§2Held Item: §fChoice Band")
				.then("§7 • §4Manaphy")
				.tooltip(
						"§4Nature: §fTimid \n§5Ability: §fHydration \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fTail Glow \n§9Move2: §fScald \n§9Move3: §fIce Beam \n§9Move4: §fEnergy Ball \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bMagmortar").tooltip(
						"§4Nature: §fModest \n§5Ability: §fVital Spirit \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fFire Blast \n§9Move2: §fThunderbolt \n§9Move3: §fFocus Blast \n§9Move4: §fEarthquake \n§2Held Item: §fLife Orb")
				.then("§7 • §4Mesprit")
				.tooltip(
						"§4Nature: §fModest \n§5Ability: §fLevitate \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fPsychic \n§9Move2: §fIce Beam \n§9Move3: §fHealing Wish \n§9Move4: §fEnergy Ball \n§2Held Item: §fChoice Specs")
				.send(p);
				new FancyMessage("§7• §bMagnezone").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fMagnet Pull \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fThunderbolt \n§9Move2: §fFlash Cannon \n§9Move3: §fVolt Switch \n§9Move4: §fSubstitute \n§2Held Item: §fChoice Scarf")
				.then("§7 • §4Milotic")
				.tooltip(
						"§4Nature: §fBold \n§5Ability: §fMarvel Scale \n§6EVS: §f255HP / 255DEF \n§9Move1: §fScald \n§9Move2: §fIce Beam \n§9Move3: §fHaze \n§9Move4: §fRecover \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bMamoswine").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fThick Fat \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fIce Shard \n§9Move2: §fEarthquake \n§9Move3: §fStealth Rock \n§9Move4: §fPeck \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bMantine").tooltip(
						"§4Nature: §fBold \n§5Ability: §fWater Absorb \n§6EVS: §f255HP / 255DEF \n§9Move1: §fScald \n§9Move2: §fToxic \n§9Move3: §fAir Slash \n§9Move4: §fDefog \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bMarowak").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fRock Head \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fBonemerang \n§9Move2: §fStone Edge \n§9Move3: §fFire Punch \n§9Move4: §fSubstitute \n§2Held Item: §fThick Club")
						.send(p);
				new FancyMessage("§7• §bMeganium").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fOvergrow \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fAromatherapy \n§9Move2: §fSynthesis \n§9Move3: §fGiga Drain \n§9Move4: §fDragon Tail \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bMetagross").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fClear Body \n§6EVS: §f255HP / 255ATK \n§9Move1: §fMeteor Mash \n§9Move2: §fBullet Punch \n§9Move3: §fIce Punch \n§9Move4: §fThunder Punch \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bMew").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fSynchronize \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fIce Beam \n§9Move2: §fWill-O-Wisp \n§9Move3: §fSoft-Boiled \n§9Move4: §fDefog \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bMewtwo").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fUnnerve \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fPsystrike \n§9Move2: §fCalm Mind \n§9Move3: §fAura Sphere \n§9Move4: §fIce Beam \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bMiltank").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fNo Guard \n§6EVS: §f255HP / 255DEF \n§9Move1: §fBody Slam \n§9Move2: §fMilk Drink \n§9Move3: §fToxic \n§9Move4: §fHeal Bell \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bMinun").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fMinus \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fEncore \n§9Move2: §fNuzzle \n§9Move3: §fBaton Pass \n§9Move4: §fSubstitute \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bMismagius").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fLevitate \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fShadow Ball \n§9Move2: §fHex \n§9Move3: §fTaunt \n§9Move4: §fWill-O-Wisp \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bMoltres").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fPressure \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fFire Blast \n§9Move2: §fHurricane \n§9Move3: §fWill-O-Wisp \n§9Move4: §fSolar Beam \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bMr.Mime").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fSoundproof \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fPsychic \n§9Move2: §fFocus Blast \n§9Move3: §fMagical Leaf \n§9Move4: §fConfusion \n§2Held Item: §fChoice Scarf")
						.send(p);
				new FancyMessage("§7• §bMuk").tooltip(
						"§4Nature: §fCareful \n§5Ability: §fSticky Hold \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fCurse \n§9Move2: §fPoison Jab \n§9Move3: §fRest \n§9Move4: §fSleep Talk \n§2Held Item: §fBlack Sludge")
						.send(p);
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				return true;
			}
			if (args[0].equalsIgnoreCase("n")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra N " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bNidoking").tooltip(
						"§4Nature: §fNaive \n§5Ability: §fSheer Force \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fSludge Wave \n§9Move2: §fEarth Power \n§9Move3: §fIce Beam \n§9Move4: §fStealth Rock \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bNidoqueen").tooltip(
						"§4Nature: §fNaive \n§5Ability: §fSheer Force \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fSludge Wave \n§9Move2: §fEarth Power \n§9Move3: §fIce Beam \n§9Move4: §fStealth Rock \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bNinetales").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fFlash Fire \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fNasty Plot \n§9Move2: §fFlamethrower \n§9Move3: §fEnergy Ball \n§9Move4: §fDark Pulse \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bNoctowl").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fInsomnia \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fDefog \n§9Move2: §fToxic \n§9Move3: §fNight Shade \n§9Move4: §fDream Eater \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("o")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra O " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bOctillery").tooltip(
						"§4Nature: §fModest \n§5Ability: §fSniper \n§6EVS: §f255HP / 255SPATK \n§9Move1: §fHydro Pump \n§9Move2: §fFire Blast \n§9Move3: §fIce Beam \n§9Move4: §fEnergy Ball \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bOmastar").tooltip(
						"§4Nature: §fBold \n§5Ability: §fShell Armor \n§6EVS: §f255HP / 255DEF \n§9Move1: §fStealth Rock \n§9Move2: §fSpikes \n§9Move3: §fScald \n§9Move4: §fProtect \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bOnix").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fSturdy \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fStealth Rock \n§9Move2: §fSunny Day \n§9Move3: §fExplosion \n§9Move4: §fTaunt \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("p")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra P " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bPachirisu").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fVolt Absorb \n§6EVS: §f255HP / 255DEF \n§9Move1: §fU-Turn \n§9Move2: §fSuper Fang \n§9Move3: §fToxic \n§9Move4: §fNuzzle\n§2Held Item: §fLeftovers")
				.then("§7 • §4Palkia")
				.tooltip(
						"§4Nature: §fModest \n§5Ability: §fPressure \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fHeal Block \n§9Move2: §fHydro Pump \n§9Move3: §fSpacial Rend \n§9Move4: §fFire Blast \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bParasect").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fDry Skin \n§6EVS: §f255HP / 255DEF \n§9Move1: §fSpore \n§9Move2: §fX-Scissor \n§9Move3: §fLeech Life \n§9Move4: §fCross Poison \n§2Held Item: §fLeftovers")
				.then("§7 • §4Politoed")
				.tooltip(
						"§4Nature: §fModest \n§5Ability: §fWater Absorb \n§6EVS: §f255SPATK / 255HP \n§9Move1: §fScald \n§9Move2: §fIce Beam \n§9Move3: §fEncore \n§9Move4: §fHydro Pump \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bPersian").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fTechnician \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fNasty Plot \n§9Move2: §fHidden Power \n§9Move3: §fSubstitute \n§9Move4: §fThunderbolt \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bPidgeot").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fKeen Eye \n§6EVS: §f255SPEED / §f255ATK \n§9Move1: §fBrave Bird \n§9Move2: §fU-Turn  \n§9Move3: §fWing Attack \n§9Move4: §fRoost \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bPinsir").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fMoxie \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fSwords Dance \n§9Move2: §fBrick Break \n§9Move3: §fX-Scissor \n§9Move4: §fEarthquake \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bPolitoed").tooltip(
						"§4Nature: §fModest \n§5Ability: §fWater Absorb \n§6EVS: §f255HP / 255SPATK \n§9Move1: §fScald \n§9Move2: §fIce Beam \n§9Move3: §fHidden Power\n§9Move4: §fHydro Pump \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bPlusle").tooltip(
						"§4Nature: §fTimid\n§5Ability: §fPlus \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fNasty Plot\n§9Move2: §fBaton Pass \n§9Move3: §fThunderbolt \n§9Move4: §fHidden Power \n§2Held Item: §fLife orb")
						.send(p);
				new FancyMessage("§7• §bPoliwrath").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fWater Absorb\n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fWaterfall \n§9Move2: §fWake-Up Slap \n§9Move3: §fToxic \n§9Move4: §fSubstitute \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bPorygon-Z").tooltip(
						"§4Nature: §fModest \n§5Ability: §fAdaptability \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fTri Attack \n§9Move2: §fNasty Plot \n§9Move3: §fThunderbolt \n§9Move4: §fRecover \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bPorygon-2").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fTrace \n§6EVS: §f255HP / 255DEF \n§9Move1: §fRecover \n§9Move2: §fThunderbolt \n§9Move3: §fIce Beam \n§9Move4: §fTrick Room \n§2Held Item: §fEviolite")
						.send(p);
				new FancyMessage("§7• §bPrimeape").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fDefiant \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fEarthquake \n§9Move2: §fStone Edge \n§9Move3: §fU-Turn \n§9Move4: §fClose Combat \n§2Held Item: §fChoice Band")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("q")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra Q " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bQwilfish").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fIntimidate \n§6EVS: §f255HP / 255DEF \n§9Move1: §fSpikes \n§9Move2: §fTaunt \n§9Move3: §fScald \n§9Move4: §fThunder Wave \n§2Held Item: §fBlack Sludge")
				.then("§7 • §4Quagsire")
				.tooltip(
						"§4Nature: §fRelaxed \n§5Ability: §fUnaware \n§6EVS: §f255HP / 255DEF \n§9Move1: §fScald \n§9Move2: §fRecover \n§9Move3: §fEarthquake \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
				.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("r")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra R " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bRaichu").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fLightning Rod \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fNasty Plot \n§9Move2: §fThunderbolt \n§9Move3: §fFocus Blast \n§9Move4: §fAgility \n§2Held Item: §fLife Orb")
				.then("§7 • §4Regice")
				.tooltip(
						"§4Nature: §fModest \n§5Ability: §fClear Body \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fRock Polish \n§9Move2: §fIce Beam \n§9Move3: §fFocus Blast \n§9Move4: §fThunderbolt \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bRaikou").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fPressure \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fCalm Mind \n§9Move2: §fThunderbolt \n§9Move3: §fVolt Switch \n§9Move4: §fSubstitute \n§2Held Item: §fLeftovers")
				.then("§7 • §4Regigigas")
				.tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSlow Start \n§6EVS: §f255ATK / 255HP \n§9Move1: §fReturn \n§9Move2: §fKnock Off \n§9Move3: §fThunder Wave \n§9Move4: §fDrain Punch \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bRampardos").tooltip(
						"§4Nature: §fNaive \n§5Ability: §fSheer Force \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fRock Slide \n§9Move2: §fFocus Punch \n§9Move3: §fZen Headbutt \n§9Move4: §fAvalanche \n§2Held Item: §fLife Orb")
				.then("§7 • §4Regirock")
				.tooltip(
						"§4Nature: §fImpish \n§5Ability: §fSturdy \n§6EVS: §f255HP / 255ATK \n§9Move1: §fStealth Rock \n§9Move2: §fStone Edge \n§9Move3: §fThunder Wave \n§9Move4: §fEarthquake \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bRapidash").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fFlash Fire \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fFlare Blitz \n§9Move2: §fWild Charge \n§9Move3: §fWill-O-Wisp \n§9Move4: §fMorning Sun \n§2Held Item: §fCharcoal")
				.then("§7 • §4Registeel")
				.tooltip(
						"§4Nature: §fCalm \n§5Ability: §fClear Body \n§6EVS: §f255SPDEF / 255HP \n§9Move1: §fSeismic Toss \n§9Move2: §fToxic \n§9Move3: §fStealth Rock \n§9Move4: §fProtect \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bRaticate").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fGuts \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fU-Turn \n§9Move2: §fFacade \n§9Move3: §fSucker Punch \n§9Move4: §fProtect \n§2Held Item: §fToxic Orb")
						.send(p);
				new FancyMessage("§7• §bRayquaza").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fAir Lock \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fDragon Dance \n§9Move2: §fEarthquake \n§9Move3: §fExtreme Speed \n§9Move4: §fSubstitute \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bReuniclus").tooltip(
						"§4Nature: §fBold \n§5Ability: §fMagic Guard \n§6EVS: §f255HP / 255SPATK \n§9Move1: §fCalm Mind \n§9Move2: §fPsyshock \n§9Move3: §fShadow Ball \n§9Move4: §fRecover \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bRhyperior").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSolid Rock \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fStealth Rock \n§9Move2: §fEarthquake \n§9Move3: §fRock Blast \n§9Move4: §fIce Punch \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("s")) {
				p.sendMessage("§f§m                     " + "§e Pokemons letra S " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bSableye").tooltip(
						"§4Nature: §fCareful \n§5Ability: §fPrankster \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fKnock Off \n§9Move2: §FProtect \n§9Move3: §fShadow claw \n§9Move4: §fFoul Play \n§2Held Item: §fLeftovers")
				.then("§7 • §4Seviper")
				.tooltip(
						"§4Nature: §fRash \n§5Ability: §fShed Skin \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fSludge Wave \n§9Move2: §fGiga Drain \n§9Move3: §fFlamethrower \n§9Move4: §fCrunch \n§2Held Item: §fLife Orb")
				.send(p);
				new FancyMessage("§7• §bSalamence").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fMoxie \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fDragon Dance \n§9Move2: §fDragon Claw \n§9Move3: §fStone Edge \n§9Move4: §fEarthquake \n§2Held Item: §fLeftovers")
				.then("§7 • §4Spinda")
				.tooltip(
						"§4Nature: §fSassy \n§5Ability: §fTangled Feet \n§6EVS: §f255ATK / 255HP \n§9Move1: §fRecycle \n§9Move2: §fTeeter Dance \n§9Move3: §fDizzy Punch \n§9Move4: §fSing \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bSamurott").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fTorrent \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fSwords dance \n§9Move2: §fWaterfall \n§9Move3: §fMegahorn \n§9Move4: §fX-Scissor \n§2Held Item: §fLife Orb")
				.then("§7 • §4Steelix")
				.tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSturdy \n§6EVS: §f255ATK / 255HP \n§9Move1: §fStealth Rock \n§9Move2: §fHeavy Slam \n§9Move3: §fEarthquake \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bSandslash").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fSand Rush \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fEarthquake \n§9Move2: §fSwords Dance \n§9Move3: §fStone Edge \n§9Move4: §fSandstorm \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bSceptile").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fOvergrow \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fLeaf Storm \n§9Move2: §fDragon Pulse \n§9Move3: §fGiga Drain \n§9Move4: §fFocus Blast \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bScizor").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fTechnician \n§6EVS: §f255Def / 255ATK \n§9Move1: §fSwords Dance \n§9Move2: §fX-Scissor \n§9Move3: §fBullet Punch \n§9Move4: §fBrick Break \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bScolipede").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fSpeed Boost \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fSwords Dance \n§9Move2: §fMegahorn \n§9Move3: §fBaton Pass \n§9Move4: §fEarthquake \n§2Held Item: §fFocus Sash")
						.send(p);
				new FancyMessage("§7• §bSeaking").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fLightning Rod \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fWaterfall \n§9Move2: §fMegahorn \n§9Move3: §fDive \n§9Move4: §fFacade \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bSerperior").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fContrary \n§6EVS: §f255SPEED / 255SpATK \n§9Move1: §fLeaf Storm \n§9Move2: §fTaunt \n§9Move3: §fLeach Seed \n§9Move4: §fDragon Pulse \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bSharpedo").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSpeed Boost \n§6EVS: §f255HP / 255ATK \n§9Move1: §fProtect \n§9Move2: §fIce Fang \n§9Move3: §fWaterfall \n§9Move4: §fCrunch \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bShuckle").tooltip(
						"§4Nature: §fBold \n§5Ability: §fSturdy \n§6EVS: §f255SPEED / 255DEF \n§9Move1: §fStealth Rock \n§9Move2: §fStick Web \n§9Move3: §fEncore \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bSigilyph").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fMagic Guard \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fPsychic \n§9Move2: §fAir Slash \n§9Move3: §fHypnosis \n§9Move4: §fEnergy Ball \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bSkarmory").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fSturdy \n§6EVS: §f255DEF / 255HP \n§9Move1: §fSpikes \n§9Move2: §fStealth Rock \n§9Move3: §fTaunt \n§9Move4: §fWhirlwind \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bSlowbro").tooltip(
						"§4Nature: §fBold \n§5Ability: §fRegenerator \n§6EVS: §f255HP / 255DEF \n§9Move1: §fSlack Off \n§9Move2: §fScald \n§9Move3: §fFlamethrower \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior §e•").command("/moveset").then("§7 Próxima Página ->")
						.command("/moveset s1").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("s1")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra S " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bSlowking").tooltip(
						"§4Nature: §fBold \n§5Ability: §fRegenerator \n§6EVS: §f255HP / 255DEF \n§9Move1: §fSlack Off \n§9Move2: §fScald \n§9Move3: §fCalm Mind \n§9Move4: §fPsyshock \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bSmeargle").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fOwn Tempo \n§6EVS: §f255DEF / 255SPEED \n§9Move1: §fStealth Rock \n§9Move2: §fSpikes \n§9Move3: §fEarthquake \n§9Move4: §fCrunch \n§2Held Item: §fFocus Sash")
						.send(p);
				new FancyMessage("§7• §bSnorlax").tooltip(
						"§4Nature: §fCareful \n§5Ability: §fThick Fat \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fSleep Talk \n§9Move2: §fEarthquake \n§9Move3: §fBody Slam \n§9Move4: §fCurse \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bSolrock").tooltip(
						"§4Nature: §fImpish \n§5Ability: §fLevitate \n§6EVS: §f255HP / 255DEF \n§9Move1: §fStealth Rock \n§9Move2: §fRock Slide \n§9Move3: §fSone Edge \n§9Move4: §fRock Slide \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bStantler").tooltip(
						"§4Nature: §fHasty \n§5Ability: §fIntimidate \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fJump Kick \n§9Move2: §fEnergy Ball \n§9Move3: §fEarthquake \n§9Move4: §fConfuse Ray \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bStaraptor").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fReckless \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fBrave Bird \n§9Move2: §fClose Combat \n§9Move3: §fU-Turn \n§9Move4: §fWing Attack \n§2Held Item: §fChoice Band")
						.send(p);
				new FancyMessage("§7• §bStarmie").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fNatural Cure \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fRecover \n§9Move2: §fPsychock \n§9Move3: §fScald \n§9Move4: §fIce Beam\n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bSuicune").tooltip(
						"§4Nature: §fBold \n§5Ability: §fPressure \n§6EVS: §f255HP / 255DEF \n§9Move1: §fScald \n§9Move2: §fCalm Mind \n§9Move3: §fSleep Talk \n§9Move4: §fIce Beam \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bSwampert").tooltip(
						"§4Nature: §fRelaxed \n§5Ability: §fTorrent \n§6EVS: §f255HP / 255DEF \n§9Move1: §fStealth Rock \n§9Move2: §fEarthquake \n§9Move3: §fWaterfall \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset s").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("t")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra T " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bTangela").tooltip(
						"§4Nature: §fModest \n§5Ability: §fRegenerator \n§6EVS: §f255HP / 255SPATK \n§9Move1: §fLeaf Storm \n§9Move2: §fSleep Powder \n§9Move3: §fGiga Drain \n§9Move4: §fAncient Power \n§2Held Item: §fLeftovers")
				.then("§7 • §4Togekiss")
				.tooltip(
						"§4Nature: §fTimid \n§5Ability: §fSerene Grace \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fNasty Plot \n§9Move2: §fAir Slash \n§9Move3: §fAura Sphere \n§9Move4: §fThunder Wave \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bTauros").tooltip(
						"§4Nature: §fNaive \n§5Ability: §fSheer Force \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fRock Climb \n§9Move2: §fEarthquake \n§9Move3: §fFire Blast \n§9Move4: §fIron Tail \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bTentacruel").tooltip(
						"§4Nature: §fBold \n§5Ability: §fLiquid Ooze \n§6EVS: §f255HP / 255DEF \n§9Move1: §fRapid Spin \n§9Move2: §fScald \n§9Move3: §fToxic Spikes \n§9Move4: §fHaze \n§2Held Item: §fBlack Sludge")
						.send(p);
				new FancyMessage("§7• §bTorterra").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fOvergrow \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fRock Polish \n§9Move2: §fWood Hammer \n§9Move3: §fEarthquake \n§9Move4: §fStone Edge \n§2Held Item: §fSoft Sand")
						.send(p);
				new FancyMessage("§7• §bTropius").tooltip(
						"§4Nature: §fBold \n§5Ability: §fHarvest \n§6EVS: §f255HP / 255DEF \n§9Move1: §fLeech Seed \n§9Move2: §fSubstitute \n§9Move3: §fAir Slash \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bTyphlosion").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fFlash Fire \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fEruption \n§9Move2: §fFire Blast \n§9Move3: §fFocus Blast \n§9Move4: §fSubstitute \n§2Held Item: §fChoice Specs")
						.send(p);
				new FancyMessage("§7• §bTyranitar").tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fSand Stream \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fStone Edge \n§9Move2: §fCrunch \n§9Move3: §fPursuit \n§9Move4: §fEarthquake \n§2Held Item: §fChoice Band")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("u")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra U " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bUmbreon").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fSynchronize \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fWish \n§9Move2: §fProtect \n§9Move3: §fFeint Attack \n§9Move4: §fDig \n§2Held Item: §fLeftovers")
				.then("§7 • §4Uxie")
				.tooltip(
						"§4Nature: §fRelaxed \n§5Ability: §fLevitate \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fTrick Room \n§9Move2: §fMemento \n§9Move3: §fStealth Rock \n§9Move4: §fPsychic \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bUrsaring").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fQuick Feet \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fFacade \n§9Move2: §fClose Combat \n§9Move3: §fCrunch \n§9Move4: §fSwords Dance \n§2Held Item: §fToxic Orb")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("v")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra V " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bVaporeon").tooltip(
						"§4Nature: §fBold \n§5Ability: §fWater Absorb \n§6EVS: §f255HP / 255SPDEF \n§9Move1: §fWish \n§9Move2: §fScald \n§9Move3: §fProtect \n§9Move4: §fToxic \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bVenomoth").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fTinted Lens \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fQuiver Dance \n§9Move2: §fBug Buzz \n§9Move3: §fSleep Powder \n§9Move4: §fSubstitute \n§2Held Item: §fBlack Sludge")
						.send(p);
				new FancyMessage("§7• §bVenusaur").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fChlorophyll \n§6EVS: §f255SPDEF / 255HP \n§9Move1: §fGiga Drain \n§9Move2: §fSludge Bomb \n§9Move3: §fSynthesis \n§9Move4: §fEarthquake \n§2Held Item: §fLeftovers")
						.send(p);
				new FancyMessage("§7• §bVictreebel").tooltip(
						"§4Nature: §fModest \n§5Ability: §fChlorophyll \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fSolar Beam \n§9Move2: §fSludge Bomb \n§9Move3: §fSleep Powder \n§9Move4: §fSubstitute \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bVileplume").tooltip(
						"§4Nature: §fBold \n§5Ability: §fEffect Spore \n§6EVS: §f255HP / 255DEF \n§9Move1: §fGiga Drain \n§9Move2: §fSludge Bomb \n§9Move3: §fSleep Powder \n§9Move4: §fSubstitute \n§2Held Item: §fBlack Sludge")
						.send(p);
				new FancyMessage("§7• §bVolcarona").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fFlame Body \n§6EVS: §f255SPEED / 255SPATK \n§9Move1: §fQuiver Dance \n§9Move2: §fBug Buzz \n§9Move3: §fFire Blast \n§9Move4: §fPsychic \n§2Held Item: §fLife Orb")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("w")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra W " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bWailord").tooltip(
						"§4Nature: §fCalm \n§5Ability: §fPressure \n§6EVS: §f255DEF / 255SPDEF \n§9Move1: §fSubstitute \n§9Move2: §fAqua Ring \n§9Move3: §fProtect \n§9Move4: §fScald \n§2Held Item: §fLeftovers")
				.then("§7 • §4Walrein")
				.tooltip(
						"§4Nature: §fCalm \n§5Ability: §fThick Fat \n§6EVS: §f255SPDEF / 255HP \n§9Move1: §fToxic \n§9Move2: §fSurf \n§9Move3: §fProtect \n§9Move4: §fRoar \n§2Held Item: §fLeftovers")
				.send(p);
				new FancyMessage("§7• §bWeavile").tooltip(
						"§4Nature: §fJolly \n§5Ability: §fPressure \n§6EVS: §f255SPEED / 255ATK \n§9Move1: §fFeint Attack \n§9Move2: §fIce Punch \n§9Move3: §fBrick Break \n§9Move4: §fPursuit \n§2Held Item: §fLife Orb")
						.send(p);
				new FancyMessage("§7• §bWobbuffet").tooltip(
						"§4Nature: §fBold \n§5Ability: §fTelepathy \n§6EVS: §f255DEF / 255SPDEF \n§9Move1: §fEncore \n§9Move2: §fDestiny Bond \n§9Move3: §fCounter \n§9Move4: §fMirror Coat \n§2Held Item: §fLeftovers")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("x")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra X " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bXatu").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fMagic Bounce \n§6EVS: §f255HP / 255DEF \n§9Move1: §fPsychic \n§9Move2: §fGrass Knot \n§9Move3: §fU-Turn \n§9Move4: §fThunder Wave \n§2Held Item: §fRocky Helmet")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("y")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra Y " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bYanmega").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fTinted Lens \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fBug Buzz \n§9Move2: §fAir Slash \n§9Move3: §fGiga Drain \n§9Move4: §fSleep Talk \n§2Held Item: §fChoice Specs")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
			if (args[0].equalsIgnoreCase("z")) {
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Pokemons letra Z " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bZapdos").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fPressure \n§6EVS: §f255HP / 255SPEED \n§9Move1: §fDischarge \n§9Move2: §fDefog \n§9Move3: §fThunderbolt \n§9Move4: §fSubstitute \n§2Held Item: §fLeftovers")
				.then("§7 • §4Zangoose")
				.tooltip(
						"§4Nature: §fAdamant \n§5Ability: §fToxic Boost \n§6EVS: §f255ATK / 255SPEED \n§9Move1: §fFacade \n§9Move2: §fClose Combat \n§9Move3: §fQuick Attack \n§9Move4: §fPursuit \n§2Held Item: §fToxic Orb")
				.send(p);
				new FancyMessage("§7• §bZoroark").tooltip(
						"§4Nature: §fTimid \n§5Ability: §fIllusion \n§6EVS: §f255SPATK / 255SPEED \n§9Move1: §fDark Pulse \n§9Move2: §fFocus Blast \n§9Move3: §fSludge Bomb \n§9Move4: §fGrass Knot \n§2Held Item: §fChoice Specs")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§7<- Voltar a página anterior").command("/moveset").send(p);
				p.sendMessage("");
				return true;
			}
		} else {
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("");
			p.sendMessage("§f§m                     " + "§e Movesets " + "§f§m                     ");
			p.sendMessage("");
			new FancyMessage("§7• Pokemons §b[A] ").command("/moveset a").then("§b[P]").command("/moveset p").send(p);
			new FancyMessage("§7• Pokemons §b[B] ").command("/moveset b").then("§b[Q]").command("/moveset q").send(p);
			new FancyMessage("§7• Pokemons §b[C] ").command("/moveset c").then("§b[R]").command("/moveset r").send(p);
			new FancyMessage("§7• Pokemons §b[D] ").command("/moveset d").then("§b[S]").command("/moveset s").send(p);
			new FancyMessage("§7• Pokemons §b[E] ").command("/moveset e").then("§b[T]").command("/moveset t").send(p);
			new FancyMessage("§7• Pokemons §b[F] ").command("/moveset f").then("§b[U]").command("/moveset u").send(p);
			new FancyMessage("§7• Pokemons §b[G] ").command("/moveset g").then("§b[V]").command("/moveset v").send(p);
			new FancyMessage("§7• Pokemons §b[H] ").command("/moveset h").then("§b[W]").command("/moveset w").send(p);
			new FancyMessage("§7• Pokemons §b[I] ").command("/moveset i").then("§b [X]").command("/moveset x").send(p);
			new FancyMessage("§7• Pokemons §b[J] ").command("/moveset j").then("§b[Y]").command("/moveset y").send(p);
			new FancyMessage("§7• Pokemons §b[K] ").command("/moveset k").then("§b[Z]").command("/moveset z").send(p);
			new FancyMessage("§7• Pokemons §b[L]").command("/moveset l").send(p);
			new FancyMessage("§7• Pokemons §b[M]").command("/moveset m").send(p);
			new FancyMessage("§7• Pokemons §b[N]").command("/moveset n").send(p);
			new FancyMessage("§7• Pokemons §b[O]").command("/moveset o").send(p);
			p.sendMessage("");
			p.sendMessage("§7• Tutorial de Movesets desenvolvido por DiiskJokey!");
			p.sendMessage("");
		}
		return false;
	}
}
