package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MountainSnow: ImageVector
    get() {
        if (_MountainSnow != null) {
            return _MountainSnow!!
        }
        _MountainSnow = ImageVector.Builder(
            name = "Outline.MountainSnow",
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
                moveToRelative(13.006f, 15.265f)
                lineToRelative(2.117f, -3.14f)
                moveToRelative(0f, 0f)
                lineToRelative(0.251f, -0.37f)
                arcToRelative(1.637f, 1.637f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.861f, 0.234f)
                lineToRelative(2.596f, 5.541f)
                curveToRelative(0.536f, 1.142f, -0.27f, 2.47f, -1.497f, 2.47f)
                horizontalLineTo(4.666f)
                curveToRelative(-1.224f, 0f, -2.03f, -1.32f, -1.501f, -2.462f)
                lineToRelative(5.808f, -12.56f)
                arcToRelative(1.641f, 1.641f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.015f, 0.03f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 15f)
                reflectiveCurveToRelative(3.5f, -1.5f, 6f, 0f)
                curveToRelative(5.972f, 3.583f, 9f, 0f, 9f, 0f)
            }
        }.build()

        return _MountainSnow!!
    }

@Suppress("ObjectPropertyName")
private var _MountainSnow: ImageVector? = null
