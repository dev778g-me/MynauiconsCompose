package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.HeartCheck: ImageVector
    get() {
        if (_HeartCheck != null) {
            return _HeartCheck!!
        }
        _HeartCheck = ImageVector.Builder(
            name = "Outline.HeartCheck",
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
                moveTo(7.75f, 3.5f)
                curveTo(5.127f, 3.5f, 3f, 5.76f, 3f, 8.547f)
                curveTo(3f, 14.125f, 12f, 20.5f, 12f, 20.5f)
                reflectiveCurveToRelative(9f, -6.375f, 9f, -11.953f)
                curveTo(21f, 5.094f, 18.873f, 3.5f, 16.25f, 3.5f)
                curveToRelative(-1.86f, 0f, -3.47f, 1.136f, -4.25f, 2.79f)
                curveToRelative(-0.78f, -1.654f, -2.39f, -2.79f, -4.25f, -2.79f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(10.25f, 12.492f)
                lineToRelative(1.039f, 1.181f)
                curveToRelative(0.095f, 0.109f, 0.267f, 0.1f, 0.351f, -0.016f)
                lineToRelative(2.11f, -2.907f)
            }
        }.build()

        return _HeartCheck!!
    }

@Suppress("ObjectPropertyName")
private var _HeartCheck: ImageVector? = null
