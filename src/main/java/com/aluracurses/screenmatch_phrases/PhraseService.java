package com.aluracurses.screenmatch_phrases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {
    @Autowired
    private PhraseRepository repository;

    public PhraseDTO getPhrasesRandom() {
        Phrase phrase = repository.getPhrasesRandom();
        return new PhraseDTO(phrase.getTitle(),
                phrase.getPhrase(), phrase.getCharacter(), phrase.getPoster());
    }
}
