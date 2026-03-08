package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.WifiLow: ImageVector
    get() {
        if (_WifiLow != null) {
            return _WifiLow!!
        }
        _WifiLow = ImageVector.Builder(
            name = "Outline.WifiLow",
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
                moveTo(16f, 16.157f)
                arcToRelative(5.657f, 5.657f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                moveToRelative(4f, 3.093f)
                verticalLineToRelative(-0.5f)
            }
        }.build()

        return _WifiLow!!
    }

@Suppress("ObjectPropertyName")
private var _WifiLow: ImageVector? = null
