package com.github.zi_jing.cuckoolib.material;

import com.github.zi_jing.cuckoolib.material.type.DustMaterial;
import com.github.zi_jing.cuckoolib.material.type.Material;
import com.github.zi_jing.cuckoolib.material.type.PlasticityMaterial;
import com.github.zi_jing.cuckoolib.material.type.StateMaterial;
import com.github.zi_jing.cuckoolib.util.ArraysUtil;

public class Materials {
	public static final StateMaterial HYDROGEN = new StateMaterial(1, "hydrogen", 0x00ffff);
	public static final StateMaterial HELIUM = new StateMaterial(2, "helium", 0xdddd00);

	public static final PlasticityMaterial LITHIUM = new PlasticityMaterial(3, "lithium", 0xc8c8c8);
	public static final PlasticityMaterial BERYLLIUM = new PlasticityMaterial(4, "beryllium", 0x64b464);
	public static final PlasticityMaterial BORON = new PlasticityMaterial(5, "boron", 0xaad2d2);
	public static final DustMaterial CARBON = new DustMaterial(6, "carbon", 0x333333);
	public static final StateMaterial NITROGEN = new StateMaterial(7, "nitrogen", 0x50b4a0);
	public static final StateMaterial OXYGEN = new StateMaterial(8, "oxygen", 0xa0c8fa);
	public static final StateMaterial FLUORINE = new StateMaterial(9, "fluorine", 0xb4ffaa);
	public static final StateMaterial NEON = new StateMaterial(10, "neon", 0xdd0000);

	public static final PlasticityMaterial SODIUM = new PlasticityMaterial(11, "sodium", 0x000096);
	public static final PlasticityMaterial MAGNESIUM = new PlasticityMaterial(12, "magnesium", 0xf09696);
	public static final PlasticityMaterial ALUMINIUM = new PlasticityMaterial(13, "aluminium", 0x78c8f0);
	public static final PlasticityMaterial SILICON = new PlasticityMaterial(14, "silicon", 0x3c3c50);
	public static final DustMaterial PHOSPHOR = new DustMaterial(15, "phosphor", 0x821e1e);
	public static final DustMaterial SULFUR = new DustMaterial(16, "sulfur", 0xc8c800);
	public static final StateMaterial CHLORINE = new StateMaterial(17, "chlorine", 0xffffaa);
	public static final StateMaterial ARGON = new StateMaterial(18, "argon", 0x32e600);

	public static final PlasticityMaterial POTASSIUM = new PlasticityMaterial(19, "potassium", 0x0a4696);
	public static final PlasticityMaterial CALCIUM = new PlasticityMaterial(20, "calcium", 0xddddaa);
	public static final PlasticityMaterial SCANDIUM = new PlasticityMaterial(21, "scandium", 0x64bebe);
	public static final PlasticityMaterial TITANIUM = new PlasticityMaterial(22, "titanium", 0xb450c8);
	public static final PlasticityMaterial VANADIUM = new PlasticityMaterial(23, "vanadium", 0x9696e6);
	public static final PlasticityMaterial CHROME = new PlasticityMaterial(24, "chrome", 0xfaaac8);
	public static final PlasticityMaterial MANGANESE = new PlasticityMaterial(25, "manganese", 0x646464);
	public static final PlasticityMaterial IRON = new PlasticityMaterial(26, "iron", 0xaaaaaa);
	public static final PlasticityMaterial COBALT = new PlasticityMaterial(27, "cobalt", 0x3232c8);
	public static final PlasticityMaterial NICKEL = new PlasticityMaterial(28, "nickel", 0x9696e6);
	public static final PlasticityMaterial COPPER = new PlasticityMaterial(29, "copper", 0xb45a00);
	public static final PlasticityMaterial ZINC = new PlasticityMaterial(30, "zinc", 0xfadcdc);
	public static final PlasticityMaterial GALLIUM = new PlasticityMaterial(31, "gallium", 0xd2d2fa);
	public static final PlasticityMaterial GERMANIUM = new PlasticityMaterial(32, "germanium", 0xc8e6a0);
	public static final PlasticityMaterial ARSENIC = new PlasticityMaterial(33, "arsenic", 0xc8c8aa);
	public static final PlasticityMaterial SELENIUM = new PlasticityMaterial(34, "selenium", 0xb48296);
	public static final StateMaterial BROMINE = new StateMaterial(35, "bromine", 0x82501e);
	public static final StateMaterial KRYPTON = new StateMaterial(36, "krypton", 0x145ad2);

	public static final PlasticityMaterial RUBIDIUM = new PlasticityMaterial(37, "rubidium", 0xb4463c);
	public static final PlasticityMaterial STRONTIUM = new PlasticityMaterial(38, "strontium", 0xc88c1e);
	public static final PlasticityMaterial YTTRIUM = new PlasticityMaterial(39, "yttrium", 0x8cb482);
	public static final PlasticityMaterial ZIRCONIUM = new PlasticityMaterial(40, "zirconium", 0x3cc8aa);
	public static final PlasticityMaterial NIOBIUM = new PlasticityMaterial(41, "niobium", 0x8c82aa);
	public static final PlasticityMaterial MOLYBDENUM = new PlasticityMaterial(42, "molybdenum", 0xaaaae6);
	public static final PlasticityMaterial TECHNETIUM = new PlasticityMaterial(43, "technetium", 0x82dc50);
	public static final PlasticityMaterial RUTHENIUM = new PlasticityMaterial(44, "ruthenium", 0x6ec8d2);
	public static final PlasticityMaterial RHODIUM = new PlasticityMaterial(45, "rhodium", 0xc8b45a);
	public static final PlasticityMaterial PALLADIUM = new PlasticityMaterial(46, "palladium", 0x82826e);
	public static final PlasticityMaterial SILVER = new PlasticityMaterial(47, "silver", 0xdcdcf0);
	public static final PlasticityMaterial CADMIUM = new PlasticityMaterial(48, "cadmium", 0xc85050);
	public static final PlasticityMaterial INDIUM = new PlasticityMaterial(49, "indium", 0x3c5ac8);
	public static final PlasticityMaterial TIN = new PlasticityMaterial(50, "tin", 0xdcdcdc);
	public static final PlasticityMaterial ANTIMONY = new PlasticityMaterial(51, "antimony", 0xdcdcc8);
	public static final PlasticityMaterial TELLURIUM = new PlasticityMaterial(52, "tellurium", 0x8cb46e);
	public static final DustMaterial IODINE = new DustMaterial(53, "iodine", 0x8232a0);
	public static final StateMaterial XENON = new StateMaterial(54, "xenon", 0x3ca0aa);

	public static final PlasticityMaterial CAESIUM = new PlasticityMaterial(55, "caesium", 0xa0505a);
	public static final PlasticityMaterial BARIUM = new PlasticityMaterial(56, "barium", 0x78d2a0);
	public static final PlasticityMaterial LANTANIUM = new PlasticityMaterial(57, "lantanium", 0xa08c5a);
	public static final PlasticityMaterial CERIUM = new PlasticityMaterial(58, "cerium", 0xa08c5a);
	public static final PlasticityMaterial PRASEODYMIUM = new PlasticityMaterial(59, "praseodymium", 0xa08c5a);
	public static final PlasticityMaterial NEODYMIUM = new PlasticityMaterial(60, "neodymium", 0x787878);
	public static final PlasticityMaterial PROMETHIUM = new PlasticityMaterial(61, "promethium", 0x6e963c);
	public static final PlasticityMaterial SAMARIUM = new PlasticityMaterial(62, "samarium", 0xa08c5a);
	public static final PlasticityMaterial EUROPIUM = new PlasticityMaterial(63, "europium", 0xa08c5a);
	public static final PlasticityMaterial GADOLINIUM = new PlasticityMaterial(64, "gadolinium", 0xa08c5a);
	public static final PlasticityMaterial TERBIUM = new PlasticityMaterial(65, "terbium", 0xa08c5a);
	public static final PlasticityMaterial DYSPROSIUM = new PlasticityMaterial(66, "dysprosium", 0xa08c5a);
	public static final PlasticityMaterial HOLMIUM = new PlasticityMaterial(67, "holmium", 0xa08c5a);
	public static final PlasticityMaterial ERBIUM = new PlasticityMaterial(68, "erbium", 0xa08c5a);
	public static final PlasticityMaterial THULIUM = new PlasticityMaterial(69, "thulium", 0xa08c5a);
	public static final PlasticityMaterial YTTERBIUM = new PlasticityMaterial(70, "ytterbium", 0xa08c5a);
	public static final PlasticityMaterial LUTETIUM = new PlasticityMaterial(71, "lutetium", 0xa08c5a);
	public static final PlasticityMaterial HAFNIUM = new PlasticityMaterial(72, "hafnium", 0x3c8c78);
	public static final PlasticityMaterial TANTALUM = new PlasticityMaterial(73, "tantalum", 0x96c8b4);
	public static final PlasticityMaterial TUNGSTEN = new PlasticityMaterial(74, "tungsten", 0x323232);
	public static final PlasticityMaterial RHENIUM = new PlasticityMaterial(75, "rhenium", 0xf0aa64);
	public static final PlasticityMaterial OSMIUM = new PlasticityMaterial(76, "osmium", 0x5050f0);
	public static final PlasticityMaterial IRIDIUM = new PlasticityMaterial(77, "iridium", 0xf0f0f0);
	public static final PlasticityMaterial PLATINUM = new PlasticityMaterial(78, "platinum", 0xf0f096);
	public static final PlasticityMaterial GOLD = new PlasticityMaterial(79, "gold", 0xf0f000);
	public static final StateMaterial MERCURY = new StateMaterial(80, "mercury", 0xa0a0a0);
	public static final PlasticityMaterial THALLIUM = new PlasticityMaterial(81, "thallium", 0xb47882);
	public static final PlasticityMaterial LEAD = new PlasticityMaterial(82, "lead", 0x8c648c);
	public static final PlasticityMaterial BISMUTH = new PlasticityMaterial(83, "bismuth", 0x64a0a0);
	public static final PlasticityMaterial POLONIUM = new PlasticityMaterial(84, "polonium", 0xb43232);
	public static final DustMaterial ASTATINE = new DustMaterial(85, "astatine", 0x328c28);
	public static final StateMaterial RADON = new StateMaterial(86, "radon", 0xf000f0);

	public static final DustMaterial FLINT = new DustMaterial(800, "flint", 0x002040);
	public static final DustMaterial STONE = new DustMaterial(801, "stone", 0xc8c8c8);

	public static void register() {
		ArraysUtil.registerAll(HYDROGEN, HELIUM, LITHIUM, BERYLLIUM, BORON, CARBON, NITROGEN, OXYGEN, FLUORINE, NEON,
				SODIUM, MAGNESIUM, ALUMINIUM, SILICON, PHOSPHOR, SULFUR, CHLORINE, ARGON, POTASSIUM, CALCIUM, SCANDIUM,
				TITANIUM, VANADIUM, CHROME, MANGANESE, IRON, COBALT, NICKEL, COPPER, ZINC, GALLIUM, GERMANIUM, ARSENIC,
				SELENIUM, BROMINE, KRYPTON, RUBIDIUM, STRONTIUM, YTTRIUM, ZIRCONIUM, NIOBIUM, MOLYBDENUM, TECHNETIUM,
				RUTHENIUM, RHODIUM, PALLADIUM, SILVER, CADMIUM, INDIUM, TIN, ANTIMONY, TELLURIUM, IODINE, XENON,
				CAESIUM, BARIUM, LANTANIUM, CERIUM, PRASEODYMIUM, NEODYMIUM, PROMETHIUM, SAMARIUM, EUROPIUM, GADOLINIUM,
				TERBIUM, DYSPROSIUM, HOLMIUM, ERBIUM, THULIUM, YTTERBIUM, LUTETIUM, HAFNIUM, TANTALUM, TUNGSTEN,
				RHENIUM, OSMIUM, IRIDIUM, PLATINUM, GOLD, MERCURY, THALLIUM, LEAD, BISMUTH, POLONIUM, ASTATINE, RADON);
		ArraysUtil.registerAll(FLINT, STONE);

		HYDROGEN.setPoint(-1, 0, -1);
		HELIUM.setPoint(-1, 0, -1);
		NITROGEN.setPoint(-1, 0, -1);
		OXYGEN.setPoint(-1, 0, -1);
		FLUORINE.setPoint(-1, 0, -1);
		NEON.setPoint(-1, 0, -1);
		CHLORINE.setPoint(-1, 0, -1);
		FLUORINE.setPoint(-1, 0, -1);
		BROMINE.setPoint(0, -1, -1);
		KRYPTON.setPoint(-1, 0, -1);
		XENON.setPoint(-1, 0, -1);
		MERCURY.setPoint(0, -1, -1);
		RADON.setPoint(-1, 0, -1);

		COPPER.addFlag(Material.GENERATE_TOOL);
		IRON.addFlag(Material.GENERATE_TOOL);
		FLINT.addFlag(Material.GENERATE_TOOL);
		STONE.addFlag(Material.GENERATE_TOOL);

		FLINT.setDurability(25600);
		STONE.setDurability(12800);

		FLINT.setHarvestLevel(1);
		STONE.setHarvestLevel(1);
	}
}