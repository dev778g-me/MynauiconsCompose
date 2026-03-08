package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Watch: ImageVector
    get() {
        if (_Watch != null) {
            return _Watch!!
        }
        _Watch = ImageVector.Builder(
            name = "Outline.Watch",
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
                moveTo(15.667f, 7f)
                curveToRelative(-0.316f, -1.377f, -0.418f, -4f, -2.348f, -4f)
                horizontalLineTo(10.68f)
                curveTo(8.751f, 3f, 8.65f, 5.623f, 8.333f, 7f)
                moveToRelative(0f, 10f)
                curveToRelative(0.316f, 1.377f, 0.418f, 4f, 2.348f, 4f)
                horizontalLineToRelative(2.638f)
                curveToRelative(1.93f, 0f, 2.032f, -2.623f, 2.348f, -4f)
                moveToRelative(1.833f, -7f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.657f, -1.231f, 3f, -2.75f, 3f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.519f, 0f, -2.75f, -1.343f, -2.75f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.657f, 1.231f, -3f, 2.75f, -3f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.519f, 0f, 2.75f, 1.343f, 2.75f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 10f)
                verticalLineToRelative(2.5f)
                lineToRelative(1.604f, 1f)
            }
        }.build()

        return _Watch!!
    }

@Suppress("ObjectPropertyName")
private var _Watch: ImageVector? = null
