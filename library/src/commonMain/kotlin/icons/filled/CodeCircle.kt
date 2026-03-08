package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.CodeCircle: ImageVector
    get() {
        if (_CodeCircle != null) {
            return _CodeCircle!!
        }
        _CodeCircle = ImageVector.Builder(
            name = "Filled.CodeCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(11.547f, -3.806f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.45f, -0.388f)
                lineToRelative(-2.143f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.449f, 0.388f)
                close()
                moveTo(15.438f, 9.169f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(0.131f, 0.132f)
                curveToRelative(0.527f, 0.526f, 0.867f, 0.869f, 1.085f, 1.155f)
                curveToRelative(0.205f, 0.268f, 0.23f, 0.396f, 0.23f, 0.484f)
                reflectiveCurveToRelative(-0.025f, 0.216f, -0.23f, 0.484f)
                curveToRelative(-0.218f, 0.286f, -0.558f, 0.629f, -1.085f, 1.155f)
                lineToRelative(-0.131f, 0.131f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(0.167f, -0.166f)
                curveToRelative(0.482f, -0.48f, 0.895f, -0.894f, 1.181f, -1.27f)
                curveToRelative(0.307f, -0.402f, 0.537f, -0.846f, 0.537f, -1.394f)
                reflectiveCurveToRelative(-0.23f, -0.992f, -0.537f, -1.394f)
                curveToRelative(-0.286f, -0.376f, -0.7f, -0.79f, -1.18f, -1.27f)
                close()
                moveTo(9.622f, 9.169f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-0.167f, 0.167f)
                curveToRelative(-0.481f, 0.48f, -0.895f, 0.894f, -1.181f, 1.27f)
                curveToRelative(-0.307f, 0.402f, -0.537f, 0.846f, -0.537f, 1.394f)
                reflectiveCurveToRelative(0.23f, 0.992f, 0.537f, 1.394f)
                curveToRelative(0.286f, 0.376f, 0.7f, 0.79f, 1.18f, 1.27f)
                lineToRelative(0.168f, 0.167f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-0.131f, -0.132f)
                curveToRelative(-0.527f, -0.526f, -0.867f, -0.869f, -1.085f, -1.155f)
                curveToRelative(-0.205f, -0.268f, -0.23f, -0.396f, -0.23f, -0.484f)
                reflectiveCurveToRelative(0.025f, -0.216f, 0.23f, -0.484f)
                curveToRelative(0.218f, -0.286f, 0.558f, -0.629f, 1.085f, -1.155f)
                lineToRelative(0.131f, -0.131f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.061f)
            }
        }.build()

        return _CodeCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CodeCircle: ImageVector? = null
