package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TreePalm: ImageVector
    get() {
        if (_TreePalm != null) {
            return _TreePalm!!
        }
        _TreePalm = ImageVector.Builder(
            name = "Outline.TreePalm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.805f, 3.11f)
                curveToRelative(2.753f, -0.554f, 5.347f, 1.04f, 6.029f, 3.801f)
                moveToRelative(0f, 0f)
                curveTo(8.632f, 8.525f, 7f, 16f, 9.617f, 21f)
                horizontalLineToRelative(4.337f)
                curveToRelative(-2.301f, -4.334f, -4.103f, -11.055f, -2.12f, -14.089f)
                moveToRelative(0f, 0f)
                curveTo(14.158f, 5.21f, 18.145f, 6.014f, 20f, 8.06f)
                moveToRelative(-8.166f, -1.15f)
                curveToRelative(2.811f, 0.703f, 4.628f, 3.646f, 4.034f, 6.543f)
                moveTo(11.834f, 6.91f)
                curveTo(9.048f, 5.684f, 5.704f, 6.68f, 4f, 9.245f)
            }
        }.build()

        return _TreePalm!!
    }

@Suppress("ObjectPropertyName")
private var _TreePalm: ImageVector? = null
