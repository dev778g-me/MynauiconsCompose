package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ShieldOff: ImageVector
    get() {
        if (_ShieldOff != null) {
            return _ShieldOff!!
        }
        _ShieldOff = ImageVector.Builder(
            name = "Outline.ShieldOff",
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
                moveToRelative(3f, 21f)
                lineToRelative(4.27f, -4.27f)
                moveTo(21f, 3f)
                lineToRelative(-2.561f, 2.561f)
                moveToRelative(0f, 0f)
                lineToRelative(0.104f, 0.011f)
                curveToRelative(0.26f, 0.027f, 0.457f, 0.25f, 0.457f, 0.515f)
                verticalLineToRelative(4.93f)
                curveToRelative(0f, 4.57f, -4.832f, 8.577f, -6.467f, 9.802f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.066f, 0f)
                curveToRelative(-0.886f, -0.663f, -2.711f, -2.144f, -4.197f, -4.09f)
                moveTo(18.44f, 5.562f)
                lineTo(7.27f, 16.73f)
                moveTo(5.646f, 14f)
                curveToRelative(-0.4f, -0.949f, -0.646f, -1.951f, -0.646f, -2.983f)
                verticalLineToRelative(-4.93f)
                curveToRelative(0f, -0.266f, 0.198f, -0.488f, 0.457f, -0.515f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.582f, -2.046f)
                lineToRelative(0.61f, -0.417f)
                arcToRelative(0.62f, 0.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.702f, 0f)
                lineToRelative(0.61f, 0.417f)
                curveToRelative(0.646f, 0.442f, 1.329f, 0.817f, 2.039f, 1.124f)
            }
        }.build()

        return _ShieldOff!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldOff: ImageVector? = null
