import preinit.Array.arrayHGP


// --- Удаление рецептов

for (item in arrayHGP.horizontalGlassPanes) {
    crafting.removeByOutput(item)
}

crafting.removeByOutput(item('hgp:hgppane'))
