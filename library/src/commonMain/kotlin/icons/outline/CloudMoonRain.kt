package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudMoonRain: ImageVector
    get() {
        if (_CloudMoonRain != null) {
            return _CloudMoonRain!!
        }
        _CloudMoonRain = ImageVector.Builder(
            name = "Outline.CloudMoonRain",
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
                moveTo(4.424f, 19.556f)
                curveToRelative(-5.62f, -6.188f, 7.064f, -12.978f, 9.226f, -4.768f)
                curveToRelative(3.07f, 0f, 6.026f, 3.132f, 3.232f, 5.469f)
                moveTo(10.5f, 21f)
                verticalLineToRelative(-1f)
                moveToRelative(3f, -1f)
                verticalLineToRelative(-1f)
                moveToRelative(-6f, 1f)
                verticalLineToRelative(-1f)
                moveTo(11f, 8.089f)
                curveTo(11f, 5.69f, 12.57f, 3.268f, 15.506f, 3f)
                curveToRelative(-2.62f, 3.498f, 1.948f, 8.034f, 5.494f, 5.449f)
                curveToRelative(-0.15f, 1.601f, -1.083f, 2.952f, -2.369f, 3.756f)
            }
        }.build()

        return _CloudMoonRain!!
    }

@Suppress("ObjectPropertyName")
private var _CloudMoonRain: ImageVector? = null
