package edu.rpi.legup.puzzle.treetent.rules;

import edu.rpi.legup.model.gameboard.Board;
import edu.rpi.legup.model.gameboard.CaseBoard;
import edu.rpi.legup.model.gameboard.PuzzleElement;
import edu.rpi.legup.model.rules.CaseRule;
import edu.rpi.legup.model.rules.RegisterRule;
import edu.rpi.legup.model.tree.TreeTransition;

import java.util.ArrayList;

public class LinkTreeCaseRule extends CaseRule
{

    public LinkTreeCaseRule()
    {
        super("Links from tree",
                "A tree must link to exactly one adjacent tent.",
                "edu/rpi/legup/images/treetent/caseLinkTree.png");
    }

    @Override
    public CaseBoard getCaseBoard(Board board)
    {
        return null;
    }

    /**
     * Gets the possible cases at a specific location based on this case rule
     *
     * @param board        the current board state
     * @param puzzleElement equivalent puzzleElement
     *
     * @return a list of elements the specified could be
     */
    @Override
    public ArrayList<Board> getCases(Board board, PuzzleElement puzzleElement)
    {
        return null;
    }

    /**
     * Checks whether the transition logically follows from the parent node using this rule
     *
     * @param transition transition to check
     *
     * @return null if the child node logically follow from the parent node, otherwise error message
     */
    @Override
    public String checkRule(TreeTransition transition)
    {
        return null;
    }

    /**
     * Checks whether the child node logically follows from the parent node
     * at the specific puzzleElement index using this rule
     *
     * @param transition   transition to check
     * @param puzzleElement equivalent puzzleElement
     *
     * @return null if the child node logically follow from the parent node at the specified puzzleElement,
     * otherwise error message
     */
    @Override
    public String checkRuleRawAt(TreeTransition transition, PuzzleElement puzzleElement)
    {
        return null;
    }

    /**
     * Checks whether the child node logically follows from the parent node using this rule
     * and if so will perform the default application of the rule
     *
     * @param transition transition to apply default application
     *
     * @return true if the child node logically follow from the parent node and accepts the changes
     * to the board, otherwise false
     */
    @Override
    public boolean doDefaultApplication(TreeTransition transition)
    {
        return false;
    }

    /**
     * Checks whether the child node logically follows from the parent node at the
     * specific puzzleElement index using this rule and if so will perform the default application of the rule
     *
     * @param transition   transition to apply default application
     * @param puzzleElement equivalent puzzleElement
     *
     * @return true if the child node logically follow from the parent node and accepts the changes
     * to the board, otherwise false
     */
    @Override
    public boolean doDefaultApplicationAt(TreeTransition transition, PuzzleElement puzzleElement)
    {
        return false;
    }
}