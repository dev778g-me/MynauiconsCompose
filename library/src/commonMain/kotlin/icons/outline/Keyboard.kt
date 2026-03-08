package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Keyboard: ImageVector
    get() {
        if (_Keyboard != null) {
            return _Keyboard!!
        }
        _Keyboard = ImageVector.Builder(
            name = "Outline.Keyboard",
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
                moveTo(2f, 11f)
                curveToRelative(0f, -2.828f, 0f, -4.243f, 0.879f, -5.121f)
                curveTo(3.757f, 5f, 5.172f, 5f, 8f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.828f, 0f, 4.243f, 0f, 5.121f, 0.879f)
                curveTo(22f, 6.757f, 22f, 8.172f, 22f, 11f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.828f, 0f, 4.243f, -0.879f, 5.121f)
                curveTo(20.243f, 19f, 18.828f, 19f, 16f, 19f)
                lineTo(8f, 19f)
                curveToRelative(-2.828f, 0f, -4.243f, 0f, -5.121f, -0.879f)
                curveTo(2f, 17.243f, 2f, 15.828f, 2f, 13f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(10f)
                moveTo(5f, 9f)
                horizontalLineToRelative(3f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(3f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(2f)
                moveTo(5f, 12f)
                horizontalLineToRelative(2f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(3f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _Keyboard!!
    }

@Suppress("ObjectPropertyName")
private var _Keyboard: ImageVector? = null
