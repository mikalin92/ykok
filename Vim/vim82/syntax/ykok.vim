" Vim syntax file
" Language: Yleisk‰ytt‰j‰n Ohjelmointikieli
" Maintainer: Mika Lindstrˆm
" Latest Revision: 25 February 2021

if exists("b:current_syntax")
  finish
endif

setlocal iskeyword+=-

syn keyword basicLanguageKeywords lis‰‰ v‰henn‰ kerro jaa jakoj‰‰nn‰ tulosta tulosta-kaikki laita-muistipaikkaan aloita-alirutiini p‰‰t‰-alirutiini katkaise-alirutiini-jos lue-komennot-tiedostosta

hi def link basicLanguageKeywords   Conditional

syn keyword basicLanguageTypes luku lukua luvulla liukuluku liukulukua liukuluvulla teksti teksti‰ tekstill‰

hi def link basicLanguageTypes  Type


setlocal filetype=ykok


