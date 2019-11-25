package edu.rpi.legup.puzzle.shorttruthtable;

import edu.rpi.legup.ui.boardview.GridElementView;

import java.awt.*;

public class ShortTruthTableElementView extends GridElementView {

    private static final Font FONT = new Font("TimesRoman", Font.BOLD, 16);
    private static final Color FONT_COLOR = Color.BLACK;

    private static final Color TRUE_COLOR = Color.GREEN;
    private static final Color FALSE_COLOR = Color.RED;
    private static final Color UNKNOWN_COLOR = Color.WHITE;
    private static final Color NOT_IN_PLAY_COLOR = Color.BLACK;

    public ShortTruthTableElementView(ShortTruthTableCell cell) {
        super(cell);
    }


    /**
     * Gets the PuzzleElement associated with this view
     *
     * @return PuzzleElement associated with this view
     */
    @Override
    public ShortTruthTableCell getPuzzleElement() {
        return (ShortTruthTableCell) super.getPuzzleElement();
    }

    @Override
    public void drawElement(Graphics2D graphics2D) {

        if(!(puzzleElement instanceof ShortTruthTableCell))
            return;

        //get informatino about the cell
        ShortTruthTableCell cell = (ShortTruthTableCell) puzzleElement;
        ShortTruthTableCellType type = cell.getData();

        //fill in background color of the cell
        graphics2D.setStroke(new BasicStroke(1));
        switch (type){
            case TRUE: graphics2D.setColor(TRUE_COLOR); break;
            case FALSE: graphics2D.setColor(FALSE_COLOR); break;
            case UNKNOWN: graphics2D.setColor(UNKNOWN_COLOR); break;
            case NOT_IN_PLAY: graphics2D.setColor(NOT_IN_PLAY_COLOR); break;
        }
        graphics2D.fillRect(location.x, location.y, size.width, size.height);

        //if the cell is not in play, nothing else has to be done
        if(type == ShortTruthTableCellType.NOT_IN_PLAY) return;

        //Draw the symbol on the cell
        graphics2D.setColor(FONT_COLOR);
        graphics2D.setFont(FONT);
        FontMetrics metrics = graphics2D.getFontMetrics(FONT);
        String value = String.valueOf(cell.getSymbol());
        int xText = location.x + (size.width - metrics.stringWidth(value)) / 2;
        int yText = location.y + ((size.height - metrics.getHeight()) / 2) + metrics.getAscent();
        graphics2D.drawString(String.valueOf(cell.getSymbol()), xText, yText);


    }
}
