package io.fotoapparat.parameter.factory;

import org.junit.Test;

import io.fotoapparat.hardware.Capabilities;
import io.fotoapparat.parameter.Flash;
import io.fotoapparat.parameter.FocusMode;
import io.fotoapparat.parameter.Parameters;
import io.fotoapparat.parameter.Size;

import static io.fotoapparat.util.TestSelectors.select;
import static junit.framework.Assert.assertEquals;

public class ParametersFactoryTest {

    static final Capabilities CAPABILITIES = Capabilities.empty();

    @Test
    public void selectPictureSize() throws Exception {
        // Given
        Size size = new Size(100, 100);

        // When
        Parameters result = ParametersFactory.selectPictureSize(CAPABILITIES, select(size));

        // Then
        assertEquals(
                new Parameters().putValue(Parameters.Type.PICTURE_SIZE, size),
                result
        );
    }

    @Test
    public void selectPreviewSize() throws Exception {
        // Given
        Size size = new Size(100, 100);

        // When
        Parameters result = ParametersFactory.selectPreviewSize(CAPABILITIES, select(size));

        // Then
        assertEquals(
                new Parameters().putValue(Parameters.Type.PREVIEW_SIZE, size),
                result
        );
    }

    @Test
    public void selectFocusMode() throws Exception {
        // Given
        FocusMode focusMode = FocusMode.AUTO;

        // When
        Parameters result = ParametersFactory.selectFocusMode(CAPABILITIES, select(focusMode));

        // Then
        assertEquals(
                new Parameters().putValue(Parameters.Type.FOCUS_MODE, focusMode),
                result
        );
    }

    @Test
    public void selectFlashMode() throws Exception {
        // Given
        Flash flash = Flash.AUTO;

        // When
        Parameters result = ParametersFactory.selectFlashMode(CAPABILITIES, select(flash));

        // Then
        assertEquals(
                new Parameters().putValue(Parameters.Type.FLASH, flash),
                result
        );
    }

}