package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.WifiMedium: ImageVector
    get() {
        if (_WifiMedium != null) {
            return _WifiMedium!!
        }
        _WifiMedium = ImageVector.Builder(
            name = "Outline.WifiMedium",
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
                moveTo(19f, 12.9f)
                curveToRelative(-3.866f, -3.867f, -10.134f, -3.867f, -14f, 0f)
                moveToRelative(11f, 3.257f)
                arcToRelative(5.657f, 5.657f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                moveToRelative(4f, 3.093f)
                verticalLineToRelative(-0.5f)
            }
        }.build()

        return _WifiMedium!!
    }

@Suppress("ObjectPropertyName")
private var _WifiMedium: ImageVector? = null
