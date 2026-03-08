package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Math: ImageVector
    get() {
        if (_Math != null) {
            return _Math!!
        }
        _Math = ImageVector.Builder(
            name = "Outline.Math",
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
                moveTo(3.429f, 18.366f)
                horizontalLineToRelative(6f)
                moveTo(15f, 8.707f)
                horizontalLineToRelative(6f)
                moveToRelative(-6f, -4.39f)
                horizontalLineToRelative(6f)
                moveTo(3f, 6.512f)
                horizontalLineToRelative(3.429f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3.428f)
                moveToRelative(-3.428f, 0f)
                verticalLineTo(3f)
                moveToRelative(0f, 3.512f)
                verticalLineToRelative(3.512f)
                moveTo(15.6f, 21f)
                lineToRelative(2.425f, -2.484f)
                moveToRelative(0f, 0f)
                lineToRelative(2.424f, -2.483f)
                moveToRelative(-2.424f, 2.483f)
                lineTo(15.6f, 16.033f)
                moveToRelative(2.425f, 2.483f)
                lineTo(20.449f, 21f)
            }
        }.build()

        return _Math!!
    }

@Suppress("ObjectPropertyName")
private var _Math: ImageVector? = null
