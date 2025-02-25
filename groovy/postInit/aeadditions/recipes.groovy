import gregtech.api.metatileentity.multiblock.CleanroomType
import classes.array.Minecraft
import classes.array.AppliedEnergistics2



if (isLoaded("aeadditions")) {

  // --- Добавление рецептов

  for (int i = 4; i < 8; i++) {
    // Предметные ячейки
    // Сбор
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('aeadditions:storage.casing'),
        AppliedEnergistics2.storageComponents[i])
      .outputs(AppliedEnergistics2.storageCells[i])
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    // Разбор
    mods.gregtech.packer.recipeBuilder()
      .inputs(AppliedEnergistics2.storageCells[i])
      .outputs(
        item('aeadditions:storage.casing'),
        AppliedEnergistics2.storageComponents[i])
      .duration(10).EUt(7).buildAndRegister()
  }
  for (int i = 4; i < 7; i++) {
    // Жидкостные ячейки
    // Сбор
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('aeadditions:storage.casing', 1),
        AppliedEnergistics2.fluidStorageComponents[i])
      .outputs(AppliedEnergistics2.fluidStorageCells[i])
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    // Разбор
    mods.gregtech.packer.recipeBuilder()
      .inputs(AppliedEnergistics2.fluidStorageCells[i])
      .outputs(
        item('aeadditions:storage.casing', 1),
        AppliedEnergistics2.fluidStorageComponents[i])
      .duration(10).EUt(7).buildAndRegister()
  }
  // Fluid Storage Housing
  mods.gregtech.assembler.recipeBuilder()
      .inputs(
        item('tfgmod:meta_item', 50) * 2, 
        metaitem('gemQuartzite') * 2, 
        metaitem('plateStainlessSteel') * 4, 
        metaitem('screwStainlessSteel') * 2)
      .outputs(item('aeadditions:storage.casing', 1))
      .duration(20).EUt(480).buildAndRegister()
  // Recycle - Fluid Housing
  mods.gregtech.macerator.recipeBuilder()
    .inputs(item('aeadditions:storage.casing', 1))
    .outputs(
      metaitem('dustStainlessSteel') * 2,
      metaitem('dustTinyStainlessSteel') * 2)
    .duration(100).EUt(16).buildAndRegister()
  mods.gregtech.arc_furnace.recipeBuilder()
    .inputs(item('aeadditions:storage.casing', 1))
    .fluidInputs(fluid('oxygen') * 56)
    .outputs(
      metaitem('ingotStainlessSteel') * 2,
      metaitem('nuggetStainlessSteel') * 2)
    .duration(56).EUt(30).buildAndRegister()

  // Advanced Storage Housing
  mods.gregtech.assembler.recipeBuilder()
      .inputs(
      item('appliedenergistics2:material:39') * 2, 
      metaitem('gemQuartzite') * 2, 
      metaitem('plateTungstenSteel') * 4, 
      metaitem('screwTungstenSteel') * 2)
      .outputs(item('aeadditions:storage.casing'))
      .duration(20).EUt(480).buildAndRegister()
  // Recycle - Advanced Storage Housing
  mods.gregtech.macerator.recipeBuilder()
    .inputs(item('aeadditions:storage.casing'))
    .outputs(
      metaitem('dustTungstenSteel') * 2,
      metaitem('dustTinyTungstenSteel') * 2)
    .duration(100).EUt(16).buildAndRegister()
  mods.gregtech.arc_furnace.recipeBuilder()
    .inputs(item('aeadditions:storage.casing'))
    .fluidInputs(fluid('oxygen') * 56)
    .outputs(
      metaitem('ingotTungstenSteel') * 2,
      metaitem('nuggetTungstenSteel') * 2)
    .duration(56).EUt(30).buildAndRegister()

  // 256k Storage Component
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      ore('circuitZpm') * 4, 
      metaitem('plateNaquadahAlloy') * 4, 
      metaitem('dustCertusQuartz') * 16, 
      item('appliedenergistics2:material', 24))
    .fluidInputs(fluid('steel') * 144)
    .outputs(item('aeadditions:storage.component'))
    .duration(400).EUt(122880).buildAndRegister()
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('appliedenergistics2:material', 24), 
      ore('circuitZpm') * 2, 
      item('appliedenergistics2:material', 38) * 4)
    .fluidInputs(fluid('steel') * 144)
    .outputs(item('aeadditions:storage.component'))
    .duration(200).EUt(122880).buildAndRegister()
  // 1024k Storage Component
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      ore('circuitZpm') * 4, 
      metaitem('plateAmericium') * 4, 
      metaitem('dustCertusQuartz') * 16, 
      item('appliedenergistics2:material', 24))
    .fluidInputs(fluid('steel') * 144)
    .outputs(item('aeadditions:storage.component', 1))
    .duration(400).EUt(122880).buildAndRegister()
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('appliedenergistics2:material', 24), 
      ore('circuitZpm') * 2, 
      item('aeadditions:storage.component') * 4)
    .fluidInputs(fluid('steel') * 144)
    .outputs(item('aeadditions:storage.component', 1))
    .duration(200).EUt(122880).buildAndRegister()
  // 4096k Storage Component
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      ore('circuitUv') * 4, 
      metaitem('plateDarmstadtium') * 4, 
      metaitem('dustCertusQuartz') * 32, 
      item('appliedenergistics2:material', 23))
    .fluidInputs(fluid('steel') * 144)
    .outputs(item('aeadditions:storage.component', 2))
    .duration(400).EUt(491520).buildAndRegister()
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('appliedenergistics2:material', 23), 
      ore('circuitUv') * 2, 
      item('aeadditions:storage.component', 1) * 4)
    .fluidInputs(fluid('steel') * 144)
    .outputs(item('aeadditions:storage.component', 2))
    .duration(200).EUt(491520).buildAndRegister()
  // 16384k Storage Component
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      ore('circuitUv') * 4, 
      metaitem('plateNeutronium') * 4, 
      metaitem('dustCertusQuartz') * 32, 
      item('appliedenergistics2:material', 23))
    .fluidInputs(fluid('steel') * 144)
    .outputs(item('aeadditions:storage.component', 3))
    .duration(400).EUt(491520).buildAndRegister()
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('appliedenergistics2:material', 23), 
      ore('circuitUv') * 2, 
      item('aeadditions:storage.component', 2) * 4)
    .fluidInputs(fluid('steel') * 144)
    .outputs(item('aeadditions:storage.component', 3))
    .duration(200).EUt(491520).buildAndRegister()

  // 256k Fluid Component
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      ore('circuitZpm') * 4, 
      metaitem('plateNaquadahAlloy') * 4, 
      metaitem('dustNetherQuartz') * 16, 
      item('appliedenergistics2:material', 24))
    .fluidInputs(fluid('stainless_steel') * 144)
    .outputs(item('aeadditions:storage.component:4'))
    .duration(400).EUt(122880).buildAndRegister()
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('appliedenergistics2:material', 24), 
      ore('circuitZpm') * 2, 
      item('appliedenergistics2:material:57') * 4)
    .fluidInputs(fluid('stainless_steel') * 144)
    .outputs(item('aeadditions:storage.component:4'))
    .duration(200).EUt(122880).buildAndRegister()
  // 1024k Fluid Component
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      ore('circuitZpm') * 4, 
      metaitem('plateAmericium') * 4, 
      metaitem('dustNetherQuartz') * 16, 
      item('appliedenergistics2:material', 24))
    .fluidInputs(fluid('stainless_steel') * 144)
    .outputs(item('aeadditions:storage.component:5'))
    .duration(400).EUt(122880).buildAndRegister()
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('appliedenergistics2:material', 24),
      ore('circuitZpm') * 2,
      item('aeadditions:storage.component:4') * 4)
    .fluidInputs(fluid('stainless_steel') * 144)
    .outputs(item('aeadditions:storage.component:5'))
    .duration(200).EUt(122880).buildAndRegister()
  // 4096k Fluid Component
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      ore('circuitUv') * 4, 
      metaitem('plateDarmstadtium') * 4, 
      metaitem('dustNetherQuartz') * 32, 
      item('appliedenergistics2:material', 23))
    .fluidInputs(fluid('stainless_steel') * 144)
    .outputs(item('aeadditions:storage.component:6'))
    .duration(400).EUt(491520).buildAndRegister()
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('appliedenergistics2:material', 23), 
      ore('circuitUv') * 2, 
      item('aeadditions:storage.component:5') * 4)
    .fluidInputs(fluid('stainless_steel') * 144)
    .outputs(item('aeadditions:storage.component:6'))
    .duration(200).EUt(491520).buildAndRegister()

  // ME Ore Dictionary Storage Bus
  // crafting.addShapeless("oredict_storage_bus", item('aeadditions:part.base:12'),
  //   [item('appliedenergistics2:part:220'), metaitem('ore_dictionary_filter')])

  // Жидкостный автозаполнитель
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('aeadditions:fluidcrafter'),
      item('appliedenergistics2:part:520'))
    .fluidInputs(fluid('plastic') * 144)
    .outputs(item('aeadditions:fluidfiller'))
    .duration(200).EUt(480).buildAndRegister()

  // Переносное жидкостное хранилище
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('appliedenergistics2:material:54'),
      item('appliedenergistics2:chest'),
      item('appliedenergistics2:energy_cell'))
    .fluidInputs(fluid('plastic') * 144)
    .outputs(item('aeadditions:storage.fluid.portable'))
    .duration(200).EUt(480).buildAndRegister()

  // Переносное предметное хранилище
  mods.gregtech.assembler.recipeBuilder()
    .inputs(
      item('aeadditions:storage.component'),
      item('appliedenergistics2:chest'),
      item('appliedenergistics2:energy_cell'))
    .fluidInputs(fluid('plastic') * 144)
    .outputs(item('aeadditions:storage.physical:4'))
    .duration(200).EUt(480).buildAndRegister()

  // Obsidian ME Drive
  crafting.addShaped("tfg/aeadditions/obsidian_me_drive", item('aeadditions:hardmedrive'), [
    [metaitem('plateObsidian'), ore('ae2.cable.dense.covered'), metaitem('plateObsidian')],
    [metaitem('plateObsidian'), item('appliedenergistics2:drive'), metaitem('plateObsidian')],
    [metaitem('plateObsidian'), item('minecraft:obsidian'), metaitem('plateObsidian')]])

  // ME Drive Fixture
  crafting.addShaped("tfg/aeadditions/me_drive_fixture", item('aeadditions:part.base'), [
    [ore('ae2.cable.glass'), item('appliedenergistics2:part:120'), ore('ae2.cable.glass')],
    [item('appliedenergistics2:part:120'), item('appliedenergistics2:drive'), item('appliedenergistics2:part:120')],
    [ore('ae2.cable.glass'), item('appliedenergistics2:part:120'), ore('ae2.cable.glass')]])

  // ME Energy Cell Fixture
  crafting.addShaped("tfg/aeadditions/me_energy_cell_fixture", item('aeadditions:part.base', 1), [
    [ore('ae2.cable.glass'), item('appliedenergistics2:part:120'), ore('ae2.cable.glass')],
    [item('appliedenergistics2:part:120'), item('appliedenergistics2:energy_cell'), item('appliedenergistics2:part:120')],
    [ore('ae2.cable.glass'), item('appliedenergistics2:part:120'), ore('ae2.cable.glass')]])


  // ME Upgrade - Tier 1
  mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
          metaitem('circuit_board.advanced'),
          metaitem('plateStainlessSteel') * 2,
          item('opencomputers:card', 7),
          item('appliedenergistics2:material', 41),
          item('opencomputers:material', 7))
      .fluidInputs(fluid('tin') * 288)
      .outputs(item('aeadditions:oc.upgrade', 2))
      .duration(200).EUt(480).buildAndRegister()

  mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
          metaitem('circuit_board.advanced'),
          metaitem('plateStainlessSteel') * 2,
          item('opencomputers:card', 7),
          item('appliedenergistics2:material', 41),
          item('opencomputers:material', 7))
      .fluidInputs(fluid('soldering_alloy') * 144)
      .outputs([item('aeadditions:oc.upgrade', 2)])
      .duration(200).EUt(480).buildAndRegister()

  // ME Upgrade - Tier 2
  mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
          metaitem('circuit_board.extreme'),
          metaitem('plateTitanium') * 2,
          item('opencomputers:card:7'),
          item('appliedenergistics2:material:41'),
          item('opencomputers:material:8'))
      .fluidInputs(fluid('tin') * 288)
      .outputs(item('aeadditions:oc.upgrade:1'))
      .duration(200).EUt(1920).buildAndRegister()
  mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(1)
      .inputs(
          metaitem('circuit_board.extreme'),
          metaitem('plateTitanium') * 2,
          item('opencomputers:card:7'),
          item('appliedenergistics2:material:41'),
          item('opencomputers:material:8'))
      .fluidInputs(fluid('soldering_alloy') * 144)
      .outputs(item('aeadditions:oc.upgrade:1'))
      .duration(200).EUt(1920).buildAndRegister()

  // ME Upgrade - Tier 3
  mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
          metaitem('circuit_board.extreme'),
          metaitem('plateTungstenSteel') * 2,
          item('opencomputers:card:7'),
          item('appliedenergistics2:material:41'),
          item('opencomputers:material:9'))
      .fluidInputs(fluid('tin') * 288)
      .outputs(item('aeadditions:oc.upgrade'))
      .duration(200).EUt(1920).buildAndRegister()
  mods.gregtech.assembler.recipeBuilder()
      .circuitMeta(2)
      .inputs(
          metaitem('circuit_board.extreme'),
          metaitem('plateTungstenSteel') * 2,
          item('opencomputers:card:7'),
          item('appliedenergistics2:material:41'),
          item('opencomputers:material:9'))
      .fluidInputs(fluid('soldering_alloy') * 144)
      .outputs(item('aeadditions:oc.upgrade'))
      .duration(200).EUt(1920).buildAndRegister()

  // 2³ Spatial Cell
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('aeadditions:storage.casing:0'),
        item('appliedenergistics2:material:32'))
      .outputs(item('appliedenergistics2:spatial_storage_cell_2_cubed'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    mods.gregtech.packer.recipeBuilder()
        .inputs(item('appliedenergistics2:spatial_storage_cell_2_cubed'))
        .outputs(
            item('aeadditions:storage.casing:0'),
            item('appliedenergistics2:material:32'))
        .duration(10).EUt(7).buildAndRegister()
    
    // 16³ Spatial Cell
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('aeadditions:storage.casing:0'),
        item('appliedenergistics2:material:33'))
      .outputs(item('appliedenergistics2:spatial_storage_cell_16_cubed'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    mods.gregtech.packer.recipeBuilder()
        .inputs(item('appliedenergistics2:spatial_storage_cell_16_cubed'))
        .outputs(
            item('aeadditions:storage.casing:0'),
            item('appliedenergistics2:material:33'))
        .duration(10).EUt(7).buildAndRegister()
    
    // 128³ Spatial Cell
    mods.gregtech.packer.recipeBuilder()
      .inputs(
        item('aeadditions:storage.casing:0'),
        item('appliedenergistics2:material:34'))
      .outputs(item('appliedenergistics2:spatial_storage_cell_128_cubed'))
      .cleanroom(CleanroomType.CLEANROOM)
      .duration(10).EUt(7).buildAndRegister()
    mods.gregtech.packer.recipeBuilder()
        .inputs(item('appliedenergistics2:spatial_storage_cell_128_cubed'))
        .outputs(
            item('aeadditions:storage.casing:0'),
            item('appliedenergistics2:material:34'))
        .duration(10).EUt(7).buildAndRegister()

}