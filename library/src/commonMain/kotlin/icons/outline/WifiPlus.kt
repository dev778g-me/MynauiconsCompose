package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.WifiPlus: ImageVector
    get() {
        if (_WifiPlus != null) {
            return _WifiPlus!!
        }
        _WifiPlus = ImageVector.Builder(
            name = "Outline.WifiPlus",
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
                moveTo(2f, 9.483f)
                arcTo(14.5f, 14.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5.5f)
                moveToRelative(7f, 7.4f)
                curveToRelative(-3.866f, -3.867f, -10.134f, -3.867f, -14f, 0f)
                moveTo(15.5f, 6f)
                horizontalLineToRelative(5f)
                moveTo(18f, 3.5f)
                verticalLineToRelative(5f)
                moveToRelative(-2f, 7.657f)
                arcToRelative(5.657f, 5.657f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                moveToRelative(4f, 3.093f)
                verticalLineToRelative(-0.5f)
            }
        }.build()

        return _WifiPlus!!
    }

@Suppress("ObjectPropertyName")
private var _WifiPlus: ImageVector? = null
