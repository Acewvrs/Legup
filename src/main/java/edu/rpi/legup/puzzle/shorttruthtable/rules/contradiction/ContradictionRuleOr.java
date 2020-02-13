package edu.rpi.legup.puzzle.shorttruthtable.rules;

import edu.rpi.legup.puzzle.shorttruthtable.ShortTruthTableOperation;

public class ContradictionRuleOr extends ContradictionRule_GenericStatement{


    public ContradictionRuleOr(){
        super("Contradicting Or",
                "An OR statement must have a contradicting pattern",
                "edu/rpi/legup/images/shorttruthtable/ruleimages/contradiction/Or.png",
                ShortTruthTableOperation.OR);
    }

}