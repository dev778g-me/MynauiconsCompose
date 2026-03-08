package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterBSquare: ImageVector
    get() {
        if (_LetterBSquare != null) {
            return _LetterBSquare!!
        }
        _LetterBSquare = ImageVector.Builder(
            name = "Filled.LetterBSquare",
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
                moveTo(9.367f, 2.25f)
                horizontalLineToRelative(5.266f)
                curveToRelative(1.092f, 0f, 1.958f, 0f, 2.655f, 0.057f)
                curveToRelative(0.714f, 0.058f, 1.317f, 0.18f, 1.869f, 0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.075f, 2.077f)
                curveToRelative(0.281f, 0.55f, 0.403f, 1.154f, 0.461f, 1.868f)
                curveToRelative(0.057f, 0.697f, 0.057f, 1.563f, 0.057f, 2.655f)
                verticalLineToRelative(5.266f)
                curveToRelative(0f, 1.092f, 0f, 1.958f, -0.057f, 2.655f)
                curveToRelative(-0.058f, 0.714f, -0.18f, 1.317f, -0.46f, 1.869f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.076f, 2.075f)
                curveToRelative(-0.552f, 0.281f, -1.155f, 0.403f, -1.869f, 0.461f)
                curveToRelative(-0.697f, 0.057f, -1.563f, 0.057f, -2.655f, 0.057f)
                horizontalLineTo(9.367f)
                curveToRelative(-1.092f, 0f, -1.958f, 0f, -2.655f, -0.057f)
                curveToRelative(-0.714f, -0.058f, -1.317f, -0.18f, -1.868f, -0.46f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.076f, -2.076f)
                curveToRelative(-0.281f, -0.552f, -0.403f, -1.155f, -0.461f, -1.869f)
                curveToRelative(-0.057f, -0.697f, -0.057f, -1.563f, -0.057f, -2.655f)
                verticalLineTo(9.367f)
                curveToRelative(0f, -1.092f, 0f, -1.958f, 0.057f, -2.655f)
                curveToRelative(0.058f, -0.714f, 0.18f, -1.317f, 0.46f, -1.868f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.077f, -2.076f)
                curveToRelative(0.55f, -0.281f, 1.154f, -0.403f, 1.868f, -0.461f)
                curveToRelative(0.697f, -0.057f, 1.563f, -0.057f, 2.655f, -0.057f)
                moveToRelative(0.133f, 5f)
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

        return _LetterBSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LetterBSquare: ImageVector? = null
