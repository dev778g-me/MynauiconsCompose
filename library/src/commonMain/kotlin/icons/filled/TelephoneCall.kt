package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TelephoneCall: ImageVector
    get() {
        if (_TelephoneCall != null) {
            return _TelephoneCall!!
        }
        _TelephoneCall = ImageVector.Builder(
            name = "Filled.TelephoneCall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.25f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                arcTo(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                arcTo(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                moveToRelative(0f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.75f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                moveTo(9.004f, 3.416f)
                curveTo(8.432f, 2.606f, 7.64f, 2.241f, 6.8f, 2.25f)
                curveToRelative(-0.797f, 0.008f, -1.573f, 0.349f, -2.221f, 0.803f)
                arcTo(6.2f, 6.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.92f, 4.79f)
                curveToRelative(-0.41f, 0.649f, -0.706f, 1.416f, -0.666f, 2.165f)
                curveToRelative(0.193f, 3.603f, 2.22f, 7.453f, 5.067f, 10.302f)
                curveToRelative(2.845f, 2.846f, 6.644f, 4.824f, 10.48f, 4.446f)
                curveToRelative(0.752f, -0.074f, 1.463f, -0.457f, 2.044f, -0.945f)
                arcToRelative(5.8f, 5.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.443f, -1.84f)
                curveToRelative(0.34f, -0.692f, 0.543f, -1.49f, 0.431f, -2.267f)
                curveToRelative(-0.116f, -0.81f, -0.569f, -1.534f, -1.402f, -2.014f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.512f, -0.31f)
                curveToRelative(-0.15f, -0.093f, -0.31f, -0.194f, -0.504f, -0.31f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.249f, -0.618f)
                curveToRelative(-0.447f, -0.163f, -0.958f, -0.27f, -1.49f, -0.197f)
                curveToRelative(-0.551f, 0.076f, -1.063f, 0.336f, -1.506f, 0.802f)
                curveToRelative(-0.341f, 0.36f, -0.843f, 0.472f, -1.549f, 0.268f)
                curveToRelative(-0.718f, -0.208f, -1.526f, -0.724f, -2.228f, -1.422f)
                curveToRelative(-0.702f, -0.696f, -1.233f, -1.51f, -1.46f, -2.245f)
                curveToRelative(-0.224f, -0.728f, -0.125f, -1.263f, 0.225f, -1.632f)
                curveToRelative(0.473f, -0.498f, 0.725f, -1.052f, 0.778f, -1.638f)
                curveToRelative(0.052f, -0.57f, -0.09f, -1.106f, -0.293f, -1.574f)
                curveToRelative(-0.304f, -0.699f, -0.82f, -1.394f, -1.224f, -1.936f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, -0.41f)
            }
        }.build()

        return _TelephoneCall!!
    }

@Suppress("ObjectPropertyName")
private var _TelephoneCall: ImageVector? = null
