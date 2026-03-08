package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Play: ImageVector
    get() {
        if (_Play != null) {
            return _Play!!
        }
        _Play = ImageVector.Builder(
            name = "Outline.Play",
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
                moveTo(14.581f, 9.402f)
                curveTo(16.194f, 10.718f, 17f, 11.375f, 17f, 12.5f)
                reflectiveCurveToRelative(-0.806f, 1.783f, -2.419f, 3.098f)
                arcToRelative(23f, 23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.292f, 0.99f)
                curveToRelative(-0.356f, 0.25f, -0.759f, 0.508f, -1.176f, 0.762f)
                curveToRelative(-1.609f, 0.978f, -2.413f, 1.467f, -3.134f, 0.926f)
                curveToRelative(-0.722f, -0.542f, -0.787f, -1.675f, -0.918f, -3.943f)
                arcTo(33f, 33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12.5f)
                curveToRelative(0f, -0.563f, 0.023f, -1.192f, 0.06f, -1.833f)
                curveToRelative(0.132f, -2.267f, 0.197f, -3.401f, 0.919f, -3.943f)
                curveToRelative(0.721f, -0.541f, 1.525f, -0.052f, 3.134f, 0.926f)
                curveToRelative(0.417f, 0.254f, 0.82f, 0.512f, 1.176f, 0.762f)
                arcToRelative(23f, 23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.292f, 0.99f)
            }
        }.build()

        return _Play!!
    }

@Suppress("ObjectPropertyName")
private var _Play: ImageVector? = null
