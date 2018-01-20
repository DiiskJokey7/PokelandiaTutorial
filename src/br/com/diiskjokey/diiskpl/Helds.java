package br.com.diiskjokey.diiskpl;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import mkremins.fanciful.FancyMessage;

public class Helds implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
		if (!(sender instanceof Player))
			return true;
		Player p = (Player) sender;
		if (args.length > 0) {
			if (args[0].equalsIgnoreCase("1")) {
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Held Items " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bAbsorb Bulb").tooltip(
						"§bUtilizado em Combate \n§fAumenta o dano de SpAtaque quando é atingido por ataques \n§fdo tipo água, consumindo o item.")
						.send(p);
				new FancyMessage("§7• §bAguav Berry").tooltip(
						"§bUtilizado em Combate \n§fCura 12,5% do HP se ele estiver com menos de 50% de HP \n§fporém se ele for das natures LAX, NAIVE, NAUGHTY, RASH \n§fele ficará confuso após o processo.")
						.send(p);
				new FancyMessage("§7• §bApicot Berry").tooltip(
						"§bUtilizado em Combate \n§fAumenta a SpDefesa do pokemon por 1 turno se \n§fo HP dele estiver abaixo de 25% na batalha.")
						.send(p);
				new FancyMessage("§7• §bBlack Belt")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques de Fighting em 20%.").send(p);
				new FancyMessage("§7• §bBlack Glasses")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques tipo Dark em 20%.").send(p);
				new FancyMessage("§7• §bBlack Sludge").tooltip(
						"§bUtilizado em Combate \n§fCura 1/16 de vida de pokemons tipo Poison por turno. \n§fSe o pokemon não for tipo Poison, ele perde 1/16 \n§fde vida por turno.")
						.send(p);
				new FancyMessage("§7• §bBug Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de tipo Bug e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bCell Battery").tooltip(
						"§bUtilizado em Combate \n§fAumenta o Ataque do pokemon se ele for atingido \n§fpor ataques elétricos, consumido-o.")
						.send(p);
				new FancyMessage("§7• §bCharcoal")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques tipo Fire em 20%.").send(p);
				new FancyMessage("§7• §bChoice Band").tooltip(
						"§bUtilizado em Combate \n§fAumenta o status de Ataque do pokemon \n§fem 50% no primeiro turno. \n§fPorém ele poderá usar apenas o mesmo ataque que utilizou \n§fno primeiro turno até o fim da batalha.")
						.send(p);
				new FancyMessage("§7• §bChoice Scarf").tooltip(
						"§bUtilizado em Combate \n§fAumenta o status de Speed do pokemon \n§fem 50% no primeiro turno. \n§fPorém ele poderá usar apenas o mesmo ataque que utilizou \n§fno primeiro turno até o fim da batalha.")
						.send(p);
				new FancyMessage("§7• §bChoice Specs").tooltip(
						"§bUtilizado em Combate \n§fAumenta o status de SpAtaque do pokemon em 1.5x. \n§fPorém ele poderá usar apenas o mesmo ataque que utilizou \n§fno primeiro turno até o fim da batalha.")
						.send(p);
				new FancyMessage("§7• §bDark Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de tipo Dark e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bDestiny Knot").tooltip(
						"§bUtilizado em BREEDING e Combate \n§fUtilizado para conseguir pokemons com 31IVS, utilizando este \n§fitem durante o BREEDING 5IVS dos pais serão passadas para o ovo. \n§fEm combate se o pokemon receber o golpe Attract \n§fo adversário também ficará apaixonado.")
						.send(p);
				new FancyMessage("§7• §bDragon Fang")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques tipo Dragon em 20%.").send(p);
				p.sendMessage("");
				new FancyMessage("§e<- §fAnterior ").command("/helds").then("§e• §fPróxima §e ->").command("/helds 2")
						.send(p.getPlayer());
				return true;
			}
			if (args[0].equalsIgnoreCase("2")) {
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Held Items " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bDragon Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Dragon e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bDragon Scale")
						.tooltip("§bUtilizado em Evolução \n§fUtilizado para evoluir Seadra.").send(p);
				new FancyMessage("§7• §bDubious Disc")
						.tooltip("§bUtilizado em Evolução \n§fUtilizado para evoluir Porygon2 para Porygon-Z.").send(p);
				new FancyMessage("§7• §bElectric Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Electric e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bElectrizer")
						.tooltip("§bUtilizado em Evolução \n§fUtilizado para evoluir Electabuzz.").send(p);
				new FancyMessage("§7• §bEverstone").tooltip(
						"§bUtilizada para BREEDING \n§fTransmite a NATURE do pokemon que está utilizando-a para o ovo.")
						.send(p);
				new FancyMessage("§7• §bEviolite").tooltip(
						"§bUtilizado em Combate \n§fAumenta em 50% a Defesa e SpDefesa do pokemon \n§fporém funciona somente em pokemons que não estão \n§fem sua forma final.")
						.send(p);
				new FancyMessage("§7• §bExp Share").tooltip(
						"§bUtilizado em Combate \n§fO pokemon que estiver utilizando o item receberá \n§fmetade da EXP que o pokemon que ganhou a luta recebeu.")
						.send(p);
				new FancyMessage("§7• §bFairy Gem").tooltip("§fSem efeitos nessa versão").send(p);
				new FancyMessage("§7• §bFighting Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Fighting e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bFigy Berry").tooltip(
						"§bUtilizado em Combate \n§fCura 12,5% do HP se ele estiver com menos de 50% de HP \n§fporém se ele for das natures BOLD, CALM, TIMID, MODEST \n§fele ficará confuso após o processo.")
						.send(p);
				new FancyMessage("§7• §bFire Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Fire e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bFlame Orb")
						.tooltip("§bUtilizado em Combate \n§fQueima o pokemon que está equipando-a.").send(p);
				new FancyMessage("§7• §bFlying Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Flying e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bFocus Band").tooltip(
						"§bUtilizado em Combate \n§fCria 10% de chance do pokemon sobreviver \n§fcom 1HP a ataques que o matariam.")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§e<- §fAnterior ").command("/helds 1").then("§e• §fPróxima §e ->").command("/helds 3")
						.send(p.getPlayer());
				return true;
			}
			if (args[0].equalsIgnoreCase("3")) {
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Held Items " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bFocus Sash").tooltip(
						"§bUtilizado em Combate \n§fSe a vida estiver cheia, o pokemon sobrevive um ataque KO, mas \n§fa vida do pokemon é reduzida para 1HP, e o item é consumido.")
						.send(p);
				new FancyMessage("§7• §bFull Incense").tooltip(
						"§bUtilizado para BREEDING e Combate \n§fFaz com que o pokemon ataque por último na batalha. \n§fSe usado em Snorlax em BREEDING o ovo nascerá como Munchlax.")
						.send(p);
				new FancyMessage("§7• §bGanlon Berry").tooltip(
						"§bUtilizado em Combate \n§fAumenta a Defesa do pokemon por 1 turno se \n§fo HP dele estiver abaixo de 25% na batalha.")
						.send(p);
				new FancyMessage("§7• §bGhost Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de tipo Ghost e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bGrass Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de tipo Grass e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bGround Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de tipo Ground e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bHard Stone")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques tipo Rock em 20%.").send(p);
				new FancyMessage("§7• §bIapapa Berry").tooltip(
						"§bUtilizado em Combate \n§fCura 12,5% do HP se ele estiver com menos de 50% de HP \n§fporém se ele for das natures GENTLE, HASTY, LONELY, MILD \n§fele ficará confuso após o processo.")
						.send(p);
				new FancyMessage("§7• §bIce Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de tipo Ice e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bLansat Berry").tooltip(
						"§bUtilizado em Combate \n§fAumenta a chance de crítico por 2 turnos se \n§fo HP dele estiver abaixo de 25% na batalha.")
						.send(p);
				new FancyMessage("§7• §bLax Incense").tooltip(
						"§bUtilizado para BREEDING e Combate \n§fAumenta a chance de desviar de ataques em 10%. \n§fSe usado em Wobbuffet em BREEDING o ovo nascerá como Wynaut.")
						.send(p);
				new FancyMessage("§7• §bLiechi Berry").tooltip(
						"§bUtilizado em Combate \n§fAumenta o Ataque do pokemon por 1 turno se \n§fo HP dele estiver abaixo de 25% na batalha.")
						.send(p);
				new FancyMessage("§7• §bKings Rock").tooltip(
						"§bUtilizado em Combate e Evolucão \n§fObtem-se 10% de chance de quando utilizado em combate \n§fo pokemon adversário retornar a pokebola. \n§fTambém e utilizado para evoluir Slowpoke para Slowking.")
						.send(p);
				new FancyMessage("§7• §bLeftovers")
						.tooltip("§bUtilizado em Combate \n§fRecupera 1/16 do HP do pokemon por turno.").send(p);
				new FancyMessage("§7• §bLeppa Berry").tooltip(
						"§bUtilizado em Combate \n§fQuando o pokemon ficar com seus ataques em 0 \n§fele irá consumir a Berry e ganhar 10 ataques adicionais.")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§e<- §fAnterior ").command("/helds 2").then("§e• §fPróxima §e ->").command("/helds 4")
						.send(p.getPlayer());
				return true;
			}
			if (args[0].equalsIgnoreCase("4")) {
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Held Items " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bLife Orb").tooltip(
						"§bUtilizado em Combate \n§fAumenta o dano dos ataques do pokemon em 30% \n§fPorém seu pokemon perde 10% de vida por turno.")
						.send(p);
				new FancyMessage("§7• §bLight Ball").tooltip(
						"§bUtilizado em Combate e BREEDING somente para Pikachu \n§fDobra o poder de Ataque e SpAtaque do Pikachu \n§fSe utilizado em BREEDING faz o Pichu nascer \n§fcom a habilidade Volt Tackle.")
						.send(p);
				new FancyMessage("§7• §bLuck Incense").tooltip(
						"§bUtilizado em Combate \n§fGanha 2x PokeDollars quando vence um NpcTrainner em batalha.")
						.send(p);
				new FancyMessage("§7• §bLucky Egg")
						.tooltip("§bUtilizado em Combate \n§fDuplica a EXP ganha pelo pokemon em combate.").send(p);
				new FancyMessage("§7• §bLucky Punch").tooltip(
						"§bUtilizado em Combate somente para Chansey \n§fAumenta a chance de crítico por 2 turnos.")
						.send(p);
				new FancyMessage("§7• §bMacho Brace").tooltip(
						"§bUtilizado em Combate \n§fO pokemon recebe 2x Evs ganhas ao fim \n§fda batalha. Porém diminui em 50% sua Speed durante a batalha.")
						.send(p);
				new FancyMessage("§7• §bMagmarizer")
						.tooltip("§bUtilizado em Evolução \n§fUtilizado para evoluir Magmar.").send(p);
				new FancyMessage("§7• §bMagnet")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques de Electric em 1.2x.").send(p);
				new FancyMessage("§7• §bMago Berry").tooltip(
						"§bUtilizado em Combate \n§fCura 12,5% do HP se ele estiver com menos de 50% de HP \n§fporém se ele for das natures BRAVE, RELAXED, QUIET, SASSY \n§fele ficará confuso apos o processo.")
						.send(p);
				new FancyMessage("§7• §bMetal Coat").tooltip(
						"§bUtilizado em Combate e Evolução \n§fAumenta o poder de ataques Steel em 1.2x. \n§fTambém e utilizado para evoluir Scyther e Onix.")
						.send(p);
				new FancyMessage("§7• §bMetal Powder").tooltip(
						"§bUtilizado em Combate somente para Ditto \n§fAumenta a Defesa e SpDefesa em 50%. \n§fPerde o efeito quando o Ditto transforma.")
						.send(p);
				new FancyMessage("§7• §bMetronome").tooltip(
						"§bUtilizado em Combate \n§fCaso utilizar o mesmo ataque duas vezes seguidas, o poder \n§fdo ataque aumenta em 20%, se acumulando ate 100%.")
						.send(p);
				new FancyMessage("§7• §bMiracle Seed")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques tipo Grass em 20%.").send(p);
				new FancyMessage("§7• §bMuscle Band").tooltip(
						"§bUtilizado em Combate \n§fAumenta o dano dos ataques físicos \n§fdo pokemon em 10% durante a batalha.")
						.send(p);
				new FancyMessage("§7• §bMystic Water")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques tipo Water em 20%.").send(p);
				p.sendMessage("");
				new FancyMessage("§e<- §fAnterior ").command("/helds 3").then("§e• §fPróxima §e ->").command("/helds 5")
						.send(p.getPlayer());
				return true;
			}
			if (args[0].equalsIgnoreCase("5")) {
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Held Items " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bNever-Melt Ice")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques tipo Ice em 20%.").send(p);
				new FancyMessage("§7• §bNormal Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Normal e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bOdd Incense")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques Psychic em 20%.").send(p);
				new FancyMessage("§7• §bOran Berry").tooltip(
						"§bUtilizado em Combate \n§fSe o pokemon estiver com menos da metade da vida \n§fele irá consumir a Berry se curando em 10 de HP.")
						.send(p);
				new FancyMessage("§7• §bPetaya Berry").tooltip(
						"§bUtilizado em Combate \n§fAumenta a Speed do pokemon por 1 turno se \n§fo HP dele estiver abaixo de 25% na batalha.")
						.send(p);
				new FancyMessage("§7• §bPoison Barb")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques tipo Poison em 20%.").send(p);
				new FancyMessage("§7• §bPoison Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Poison e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bPower Anklet").tooltip(
						"§bUtilizado em Combate \n§fO pokemon ganha 4 pontos de EVS de \n§fSpeed a mais ao derrotar outro pokemon.")
						.send(p);
				new FancyMessage("§7• §bPower Band").tooltip(
						"§bUtilizado em Combate \n§fO pokemon ganha 4 pontos de EVS de \n§fSpDefesa a mais ao derrotar outro pokemon.")
						.send(p);
				new FancyMessage("§7• §bPower Belt").tooltip(
						"§bUtilizado em Combate \n§fO pokemon ganha 4 pontos de EVS de \n§fDefesa a mais ao derrotar outro pokemon.")
						.send(p);
				new FancyMessage("§7• §bPower Bracer").tooltip(
						"§bUtilizado em Combate \n§fO pokemon ganha 4 pontos de EVS de \n§fAtaque a mais ao derrotar outro pokemon.")
						.send(p);
				new FancyMessage("§7• §bPower Lens").tooltip(
						"§bUtilizado em Combate \n§fO pokemon ganha 4 pontos de EVS de \n§fSpAtaque a mais ao derrotar outro pokemon.")
						.send(p);
				new FancyMessage("§7• §bPower Weight").tooltip(
						"§bUtilizado em Combate \n§fO pokemon ganha 4 pontos de EVS de HP a mais ao derrotar outro pokemon.")
						.send(p);
				new FancyMessage("§7• §bProtector")
						.tooltip("§bUtilizado em Evolução \n§fUtilizado para evoluir Rhydon.").send(p);
				new FancyMessage("§7• §bPsychic Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Psychic e depois é consumida.")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§e<- §fAnterior ").command("/helds 4").then("§e• §fPróxima §e ->").command("/helds 6")
						.send(p.getPlayer());
				return true;
			}
			if (args[0].equalsIgnoreCase("6")) {
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Held Items " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bPure Incense").tooltip("§fSem efeitos nessa versão").send(p);
				new FancyMessage("§7• §bQuick Powder").tooltip(
						"§bUtilizado em Combate somente para Ditto \n§fAumenta a Speed em 2x. \n§fPerde o efeito quando o Ditto transforma.")
						.send(p);
				new FancyMessage("§7• §bRawst Berry").tooltip(
						"§bUtilizado em Combate \n§fSe o pokemon for atingido com queimaduras ele irá \n§fconsumir a Berry e se curar das queimaduras.")
						.send(p);
				new FancyMessage("§7• §bRazor Claw").tooltip(
						"§bUtilizado em Combate e Evolução \n§fAumenta a chance de acertos críticos. \n§fTambém é utilizado para evoluir Sneasel.")
						.send(p);
				new FancyMessage("§7• §bRazor Fang").tooltip(
						"§bUtilizado em Combate e Evolução \n§fObtem-se 10% de chance de quando utilizado em combate \n§fo pokemon adversário retornar a pokebola. \n§fTambém é utilizado para evoluir Gligar.")
						.send(p);
				new FancyMessage("§7• §bRock Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Rock e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bRock Incense")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques de Rock em 20%.").send(p);
				new FancyMessage("§7• §bRocky Helmet").tooltip(
						"§bUtilizado em Combate \n§fSe o pokemon for atingido por um golpe o adversário \n§frecebe 1/6 do seu HP máximo em dano.")
						.send(p);
				new FancyMessage("§7• §bRose Incense")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques de Grass em 20%.").send(p);
				new FancyMessage("§7• §bSalac Berry").tooltip(
						"§bUtilizado em Combate \n§fAumenta a Speed do pokemon por 1 turno se \n§fo HP dele estiver abaixo de 25% na batalha.")
						.send(p);
				new FancyMessage("§7• §bSea Incense")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques de Water em 20%.").send(p);
				new FancyMessage("§7• §bSharp Beak")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques tipo Flying em 20%.").send(p);
				new FancyMessage("§7• §bShell Bell").tooltip(
						"§bUtilizado em Combate \n§fRecupera 1/8 do HP do pokemon com base no dano \n§fque ele causou no turno.")
						.send(p);
				new FancyMessage("§7• §bSilk Scarf")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques Normal em 20%.").send(p);
				new FancyMessage("§7• §bSilver Powder")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques Bug em 20%.").send(p);
				p.sendMessage("");
				new FancyMessage("§e<- §fAnterior ").command("/helds 5").then("§e• §fPróxima §e ->").command("/helds 7")
						.send(p.getPlayer());
				return true;
			}
			if (args[0].equalsIgnoreCase("7")) {
				p.sendMessage("");
				p.sendMessage("§f§m                     " + "§e Held Items " + "§f§m                     ");
				p.sendMessage("§7• Arraste o mouse sobre os nomes!");
				p.sendMessage("");
				new FancyMessage("§7• §bSmoke Ball").tooltip(
						"§bUtilizado em Combate \n§fQuando equipado o pokemon terá 100% de chance de \n§ffugir de batalhas contra pokemons selvagens.")
						.send(p);
				new FancyMessage("§7• §bSoft Sand")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques de Ground em 20%.").send(p);
				new FancyMessage("§7• §bSoothe Bell")
						.tooltip("§bItem Comum \n§fAumenta a taxa de felicidade ganha do pokemon.").send(p);
				new FancyMessage("§7• §bSpell Tag")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques de Ghost em 20%.").send(p);
				new FancyMessage("§7• §bStarf Berry").tooltip(
						"§bUtilizado em Combate \n§fAumenta um dos 6 atributos aleatoriamente por 1 turno \n§fse o HP dele estiver abaixo de 25% na batalha.")
						.send(p);
				new FancyMessage("§7• §bSteel Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de \n§ftipo Steel e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bStick").tooltip(
						"§bUtilizado em Combate somente para Farfetch'd \n§fAumenta a chance de crítico por 2 turnos.")
						.send(p);
				new FancyMessage("§7• §bThick Club")
						.tooltip("§bUtilizado em Combate somente para Cubone e Marowak \n§fDobra o poder de Ataque.")
						.send(p);
				new FancyMessage("§7• §bToxic Orb")
						.tooltip("§bUtilizado em Combate \n§fEnvenena o pokemon que está equipando-a.").send(p);
				new FancyMessage("§7• §bTwisted Spoon")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques de Psychic em 20%.").send(p);
				new FancyMessage("§7• §bUp-Grade")
						.tooltip("§bUtilizado em Evolução \n§fUtilizado para evoluir Porygon para Porygon2.").send(p);
				new FancyMessage("§7• §bWater Gem").tooltip(
						"§bUtilizado em Combate \n§fAumenta o poder em 1.3x de um ataque de tipo Water e depois é consumida.")
						.send(p);
				new FancyMessage("§7• §bWave Incense")
						.tooltip("§bUtilizado em Combate \n§fAumenta o poder de ataques de Water em 20%.").send(p);
				new FancyMessage("§7• §bWide Lens")
						.tooltip("§bUtilizado em Combate \n§fAumenta a precisão dos ataques do pokemon em 10%.")
						.send(p);
				new FancyMessage("§7• §bWiki Berry").tooltip(
						"§bUtilizado em Combate \n§fCura 12,5% do HP se ele estiver com menos de 50% de HP \n§fporém se ele for das natures ADAMANT, CAREFUL, IMPISH, JOLLY \n§fele ficará confuso após o processo.")
						.send(p);
				p.sendMessage("");
				new FancyMessage("§e<- §fAnterior ").command("/helds 6").send(p.getPlayer());
				return true;
			}
		} else {
			new FancyMessage("§7• Helds §b[A a D]").command("/helds 1").send(p);
			new FancyMessage("§7• Helds §b[D a F]").command("/helds 2").send(p);
			new FancyMessage("§7• Helds §b[F a L]").command("/helds 3").send(p);
			new FancyMessage("§7• Helds §b[L a M]").command("/helds 4").send(p);
			new FancyMessage("§7• Helds §b[N a P]").command("/helds 5").send(p);
			new FancyMessage("§7• Helds §b[P a S]").command("/helds 6").send(p);
			new FancyMessage("§7• Helds §b[S a W]").command("/helds 7").send(p);
			p.sendMessage("");
			p.sendMessage("§7• Tutorial de Helds desenvolvido por DiiskJokey!");
			p.sendMessage("");
		}
		return false;
	}
}
