package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterBHexagon: ImageVector
    get() {
        if (_LetterBHexagon != null) {
            return _LetterBHexagon!!
        }
        _LetterBHexagon = ImageVector.Builder(
            name = "Filled.LetterBHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.241f, 9.8f)
                curveToRelative(0.064f, 0.602f, -0.204f, 1.191f, -0.761f, 1.45f)
                horizontalLineToRelative(-3.23f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.921f)
                curveToRelative(0.62f, 0f, 1.005f, 0.425f, 1.07f, 1.05f)
                moveToRelative(-3.991f, 5.45f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.23f)
                curveToRelative(0.557f, 0.259f, 0.825f, 0.848f, 0.761f, 1.45f)
                curveToRelative(-0.065f, 0.625f, -0.45f, 1.05f, -1.07f, 1.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 2.105f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(6.611f, 3.8f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.25f, 8.2f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.318f, 2.291f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-6.608f, 3.799f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.639f, 0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-6.608f, -3.8f)
                horizontalLineToRelative(-0.003f)
                arcTo(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 15.8f)
                verticalLineTo(8.198f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.318f, -2.291f)
                lineToRelative(0.003f, -0.002f)
                close()
                moveTo(9.5f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.671f)
                curveToRelative(1.572f, 0f, 2.437f, -1.204f, 2.562f, -2.393f)
                curveToRelative(0.085f, -0.806f, -0.153f, -1.706f, -0.767f, -2.357f)
                curveToRelative(0.614f, -0.651f, 0.852f, -1.551f, 0.767f, -2.357f)
                curveToRelative(-0.125f, -1.19f, -0.99f, -2.393f, -2.562f, -2.393f)
                close()
            }
        }.build()

        return _LetterBHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _LetterBHexagon: ImageVector? = null
