package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowDiagonalTwo: ImageVector
    get() {
        if (_ArrowDiagonalTwo != null) {
            return _ArrowDiagonalTwo!!
        }
        _ArrowDiagonalTwo = ImageVector.Builder(
            name = "Outline.ArrowDiagonalTwo",
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
                moveToRelative(11.293f, 4.929f)
                lineToRelative(7.778f, 7.778f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-4.95f)
                moveToRelative(4.95f, 0f)
                verticalLineToRelative(-4.95f)
                moveToRelative(-6.364f, 11.314f)
                lineTo(4.93f, 11.293f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(4.95f)
                moveToRelative(0f, -4.95f)
                horizontalLineToRelative(4.95f)
            }
        }.build()

        return _ArrowDiagonalTwo!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDiagonalTwo: ImageVector? = null
