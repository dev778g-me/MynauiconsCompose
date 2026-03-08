package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AsteriskCircle: ImageVector
    get() {
        if (_AsteriskCircle != null) {
            return _AsteriskCircle!!
        }
        _AsteriskCircle = ImageVector.Builder(
            name = "Outline.AsteriskCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                moveToRelative(-9f, -3.5f)
                verticalLineToRelative(7f)
                moveToRelative(-3f, -1.75f)
                lineToRelative(6f, -3.5f)
                moveToRelative(-6f, 0f)
                lineToRelative(6f, 3.5f)
            }
        }.build()

        return _AsteriskCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AsteriskCircle: ImageVector? = null
