package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SignalCircle: ImageVector
    get() {
        if (_SignalCircle != null) {
            return _SignalCircle!!
        }
        _SignalCircle = ImageVector.Builder(
            name = "Outline.SignalCircle",
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
                moveTo(9f, 13.5f)
                verticalLineToRelative(-3f)
                moveToRelative(3f, 4.5f)
                verticalLineTo(9f)
                moveToRelative(3f, 4.5f)
                verticalLineToRelative(-3f)
            }
        }.build()

        return _SignalCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SignalCircle: ImageVector? = null
