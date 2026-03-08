package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Fire: ImageVector
    get() {
        if (_Fire != null) {
            return _Fire!!
        }
        _Fire = ImageVector.Builder(
            name = "Outline.Fire",
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
                moveTo(19.27f, 16.202f)
                arcTo(7.81f, 7.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.06f, 21f)
                curveToRelative(-4.313f, 0f, -7.81f, -3.492f, -7.81f, -7.8f)
                reflectiveCurveTo(5.89f, 7.13f, 8.455f, 3f)
                curveToRelative(4.806f, 2.1f, 4.806f, 8.4f, 4.806f, 8.4f)
                reflectiveCurveToRelative(1.579f, -3.038f, 4.807f, -4.5f)
                curveToRelative(1.034f, 3.042f, 2.43f, 6.365f, 1.202f, 9.302f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
            }
        }.build()

        return _Fire!!
    }

@Suppress("ObjectPropertyName")
private var _Fire: ImageVector? = null
